package com.sushma.spring.springBeanScopeExample_4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sushma.spring.springBeanScopeExample_4.singleton.BinarySearchImpl;

@SpringBootApplication
public class SpringBeanScopeSingletonApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(SpringBeanScopeSingletonApplication.class, args);
		
		
		//By default bean1 and bean2 are same as defaulr Scope is SINGLETON
		BinarySearchImpl bean1 = appContext.getBean(BinarySearchImpl.class);
		System.out.println(bean1);
		BinarySearchImpl bean2 = appContext.getBean(BinarySearchImpl.class);
		System.out.println(bean2);
		
		
		//bean1.binarySearchImpl(new int[] {1,5,2,7,9}, 9);
		//bean2.binarySearchImpl(new int[] {1,5,2,7,9}, 4);
	}
}
