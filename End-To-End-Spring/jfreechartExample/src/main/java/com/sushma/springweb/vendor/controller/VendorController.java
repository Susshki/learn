package com.sushma.springweb.vendor.controller;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sushma.springweb.vendor.entities.Vendor;
import com.sushma.springweb.vendor.service.VendorService;
import com.sushma.springweb.vendor.util.ReportUtil;

@Controller
public class VendorController {
	@Autowired
	private VendorService service;
	
	@Autowired
	private ReportUtil reportUtil;
	
	@Autowired
	private ServletContext sc; //webapp folder
	
	@RequestMapping("/showCreateVendor")
	public String showCreateVendor() {
		return "showCreateVendor";
	}
	

	@RequestMapping(value="/saveVendor", method=RequestMethod.POST)
	public String saveVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap) {
		service.createVendor(vendor);
		
		List<Vendor> vendors = service.getAllVendors();
		modelMap.addAttribute("vendors", vendors);
		return "viewAll";
	}
	
	@RequestMapping("/viewAll")
	public String saveVendor(ModelMap modelMap) {
		List<Vendor> vendors = service.getAllVendors();
		modelMap.addAttribute("vendors", vendors);
		return "viewAll";
	}
	
	@RequestMapping("/generateReport")
	public String generateReport() {
		reportUtil.generateReport(sc.getRealPath("/"), service.getVendorTypeData());
		return "vendorReport";
	}
	
}
