package com.sushma.springboot.webProjContentNego10;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/sayHello")
	public HelloBean sayHello() {
		return new HelloBean ("Good Morning!");
	}
	
	@PostMapping("/sayHelloByName")
	public HelloBean sayHelloByName(@RequestBody User user) {
		return new HelloBean(String.format("Good Morning %s!", user.getName()));
	}
	
	//String doesnt work for some reason
	@PostMapping("/sayHelloByNameStr")
	public HelloBean sayHelloByName(@RequestBody String name) {
		return new HelloBean(String.format("Good Morning %s!", name));
	}
}
