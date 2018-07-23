package com.sushma.spring.juintTesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sushma.spring.juintTesting.binarysearch.BinarySearchImpl;

@SpringBootApplication
public class JuintTestingApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(JuintTestingApplication.class, args);
		
		BinarySearchImpl binarySearchImpl = appContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearchImpl.binarySearch(new int[] {3, 7,1}, 6));
	}
}
