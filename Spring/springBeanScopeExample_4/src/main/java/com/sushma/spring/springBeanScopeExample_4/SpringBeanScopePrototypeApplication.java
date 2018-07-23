package com.sushma.spring.springBeanScopeExample_4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sushma.spring.springBeanScopeExample_4.prototype.BinarySearchImplPro;

@SpringBootApplication
public class SpringBeanScopePrototypeApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(SpringBeanScopePrototypeApplication.class, args);
		
		
		//By default bean1 and bean2 are same as defaulr Scope is SINGLETON
		BinarySearchImplPro bean1 = appContext.getBean(BinarySearchImplPro.class);
		System.out.println(bean1);
		BinarySearchImplPro bean2 = appContext.getBean(BinarySearchImplPro.class);
		System.out.println(bean2);
		
		
		//bean1.binarySearchImpl(new int[] {1,5,2,7,9}, 6);
		//bean2.binarySearchImpl(new int[] {1,5,2,7,9}, 9);
	}
}
