package com.sushma.spring.autowireByPrimary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	 
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	
	public int  binarySearchImpl(int[] dataArray, int search) {
		
		//sort the data
		int[] sortedData = sortAlgorithm.sort(dataArray);
		//perform search		
		return 3;//hardcoded
	}
}
