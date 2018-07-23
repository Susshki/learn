package com.sushma.spring.springBeanScopeExample_4.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	 
	@Autowired
	private SortAlgorithm sortAlgorithm; //bnyname - is Overridden by the @Qualifier annotation
	
	
	public int  binarySearchImpl(int[] dataArray, int search) {
		
		//sort the data
		int[] sortedData = sortAlgorithm.sort(dataArray);
		//perform search		
		return 8;//hardcoded
	}
}
