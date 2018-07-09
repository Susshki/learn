package com.sushma.springboot.webProjSwagger11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/sayHello")
	public HelloBean sayHello() {
		return new HelloBean("Good Morning!");
	}
}
