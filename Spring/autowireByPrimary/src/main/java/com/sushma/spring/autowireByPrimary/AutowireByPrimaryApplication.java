package com.sushma.spring.autowireByPrimary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AutowireByPrimaryApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AutowireByPrimaryApplication.class, args);
		
		BinarySearchImpl binarySearchBean = context.getBean(BinarySearchImpl.class);
		
		binarySearchBean.binarySearchImpl(new int[] {10, 2, 30,8});
		
		
	}
}
