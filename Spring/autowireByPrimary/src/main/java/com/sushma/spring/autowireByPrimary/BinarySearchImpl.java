package com.sushma.spring.autowireByPrimary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	 
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	
	public boolean  binarySearchImpl(int[] dataArray) {
		
		//sort the data
		int[] sortedData = sortAlgorithm.sort(dataArray);
		//perform search		
		return true;//hardcoded
	}
}
