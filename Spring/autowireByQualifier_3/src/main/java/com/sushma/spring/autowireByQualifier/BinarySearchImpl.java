package com.sushma.spring.autowireByQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	 
	@Autowired
	@Qualifier("'quick")
	private SortAlgorithm bubbleSortAlgorithm; //bnyname - is Overrideen by the @Qualifier annotation
	
	
	public boolean  binarySearchImpl(int[] dataArray, int search) {
		
		//sort the data
		int[] sortedData = bubbleSortAlgorithm.sort(dataArray);
		//perform search		
		return true;//hardcoded
	}
}
