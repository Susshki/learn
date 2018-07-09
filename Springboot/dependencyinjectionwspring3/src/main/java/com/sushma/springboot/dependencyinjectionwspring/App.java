package com.sushma.springboot.dependencyinjectionwspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = SpringApplication.run(App.class, args);
    	BinarySearchImpl binarySearch = context.getBean(BinarySearchImpl.class);
    	
    	System.out.println(binarySearch.binarySearch(new int[] {10, 5, 4}, 4));
    }
}
