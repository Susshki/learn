package com.sushma.spring.autowireByQualifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AutowireByQualifierApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AutowireByQualifierApplication.class, args);
		
		BinarySearchImpl bean = context.getBean(BinarySearchImpl.class);
		bean.binarySearchImpl(new int[] {9,12,4,1}, 9);
		
		
	}
}
