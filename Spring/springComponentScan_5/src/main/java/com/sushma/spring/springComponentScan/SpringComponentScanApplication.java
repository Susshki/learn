package com.sushma.spring.springComponentScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.sushma.spring.binarySearch.BinarySearchImpl;

@SpringBootApplication
@ComponentScan("com.sushma.spring.binarySearch")
public class SpringComponentScanApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(SpringComponentScanApplication.class, args);
		
		BinarySearchImpl bean = appContext.getBean(BinarySearchImpl.class);
		System.out.println(bean);
	}
}
