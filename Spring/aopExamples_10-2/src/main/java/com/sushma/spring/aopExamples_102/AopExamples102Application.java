package com.sushma.spring.aopExamples_102;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sushma.spring.aopExamples_102.service.Service1;
import com.sushma.spring.aopExamples_102.service.Service2;

@SpringBootApplication
public class AopExamples102Application implements CommandLineRunner{

	@Autowired
	private Service1 service1;
	
	@Autowired
	private Service2 service2;
	
	@Override
	public void run(String... args) throws Exception {
		service1.service1();
		service2.service2();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AopExamples102Application.class, args);
	}
}
