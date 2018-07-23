package com.sushma.juint;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JunitExampleApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(JunitExampleApplication.class, args);
		
		//SomeService bean = appContext.getBean(SomeService.class);
	}
}
