package com.sushma.spring.springBeanLifeCycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.sushma.spring.binarySearch.BinarySearchImpl;

@SpringBootApplication
@ComponentScan("com.sushma.spring.binarySearch")
public class SpringBeanLifeCycleApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(SpringBeanLifeCycleApplication.class, args);
		
		BinarySearchImpl bean = appContext.getBean(BinarySearchImpl.class);
		System.out.println(bean.binarySearch(new int[] {34, 12,6,9},9));
		
	}
}
