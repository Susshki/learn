package com.sushma.spring.readFromPropertyFile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:configurationFile.properties")
public class ReadFromPropertyFileApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(ReadFromPropertyFileApplication.class, args);
		
		SomeService someService = appContext.getBean(SomeService.class);
		System.out.println(someService.getUrl());
	}
}
