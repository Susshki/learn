package com.sushma.springweb.flight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sushma.springweb.flight.entities.User;
import com.sushma.springweb.flight.service.SecurityServiceImpl;
import com.sushma.springweb.flight.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private SecurityServiceImpl secuirtyService;
	
	@RequestMapping("/showregistration")
	public String showRegistration() {
		return "showregistration";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register(@ModelAttribute("user") User user) {
		System.out.println("*****8888888888888888888888888user:"+user);
		user.setPasscode(bCryptPasswordEncoder.encode(user.getPasscode()));
		userService.addUser(user);
		
		return "showlogin";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam String email, @RequestParam String password, ModelMap modelMap) {
		if(secuirtyService.login(email, password)) {
			return "homepage";
		}
		
		modelMap.addAttribute("message", "Invalid UserName and Passcode. Please Try again");
		return "showlogin";
	}
	
	@RequestMapping("/login")
	public String showLogin() {		
		return "showlogin";	
	}
}
