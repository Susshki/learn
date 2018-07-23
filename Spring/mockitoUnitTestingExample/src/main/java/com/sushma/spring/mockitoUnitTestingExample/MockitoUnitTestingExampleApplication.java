package com.sushma.spring.mockitoUnitTestingExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sushma.spring.mockitoUnitTestingExample.somebusiness.SomeBusiness;

@SpringBootApplication
public class MockitoUnitTestingExampleApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(MockitoUnitTestingExampleApplication.class, args);
		
		SomeBusiness bean = appContext.getBean(SomeBusiness.class);		
		System.out.println(bean.getGreatestValue());
	}
}
