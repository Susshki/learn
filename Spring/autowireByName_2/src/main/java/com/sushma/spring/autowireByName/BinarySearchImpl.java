package com.sushma.spring.autowireByName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	 
	@Autowired
	private SortAlgorithm bubbleSortAlgorithm; //bnyname - should be camel cased className
	
	
	public int  binarySearchImpl(int[] dataArray, int search) {
		
		//sort the data
		int[] sortedData = bubbleSortAlgorithm.sort(dataArray);
		//perform search		
		return 5;//hardcoded
	}
}
