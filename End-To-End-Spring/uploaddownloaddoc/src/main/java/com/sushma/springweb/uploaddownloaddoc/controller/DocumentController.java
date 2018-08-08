package com.sushma.springweb.uploaddownloaddoc.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

import com.sushma.springweb.uploaddownloaddoc.entities.Document;
import com.sushma.springweb.uploaddownloaddoc.repos.DocumentRepository;

@Controller
public class DocumentController {

	@Autowired
	private DocumentRepository documentRepository;
	
	@RequestMapping(value="/showUpload")
	public String showUpload() {
		return "showUpload";
	}
	
	@RequestMapping(value="/upload" ,  method=RequestMethod.POST)
	public String upload(@RequestParam("document") MultipartFile file, @RequestParam("id") Long id, ModelMap modelMap) {
		
		Document document = new Document();
		document.setId(id);
		document.setName(file.getOriginalFilename());
		try {
			document.setData(file.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		documentRepository.save(document);
		
		List<Document> documents = documentRepository.findAll();
		modelMap.addAttribute("documents", documents);
		return "upload";
	}
	
	@RequestMapping("/download")
	public StreamingResponseBody download(@RequestParam Long id, HttpServletResponse response) {
		Document document = null;
		Optional<Document> documentopt = documentRepository.findById(id);
		if(documentopt.isPresent()) {
			document = documentopt.get();
		}
		else {
			return null;
		}
		
		byte[] data = document.getData();
		
		return outputStream -> {
			outputStream.write(data);				
		};
		}
}
