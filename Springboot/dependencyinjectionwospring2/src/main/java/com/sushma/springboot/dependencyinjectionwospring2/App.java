package com.sushma.springboot.dependencyinjectionwospring2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
    	BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
    	System.out.println(binarySearch.binarySearchImpl(new int[] {12,3,5},4));
        //SpringApplication.run(App.class, args);
    }
}
