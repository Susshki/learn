package com.sushma.springmvc.servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sushma.springmvc.service.UserValidationService;

@Controller
public class LoginServlet {
	@Autowired
	private UserValidationService service;
	
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String loginPage() {
		System.out.println("#####loginPage");
		return "login";
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login(@RequestParam String username, @RequestParam String password, ModelMap model) {
		System.out.println("#####login");
		
		if(!service.isValidService(username, password)){
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}
		
		//if successful
		model.put("username", username);
		model.put("password", password);		
		return "welcome";
	}
}
