package com.sushma.spring.autowireByName;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AutowireByNameApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(AutowireByNameApplication.class, args);
		
		BinarySearchImpl binarySearchImpl = appContext.getBean(BinarySearchImpl.class);
		binarySearchImpl.binarySearchImpl(new int[] {5,12,1}, 5);
	}
}
