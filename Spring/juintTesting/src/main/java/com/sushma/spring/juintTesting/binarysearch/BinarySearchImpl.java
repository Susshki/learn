package com.sushma.spring.juintTesting.binarysearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	@Qualifier("quick")
	private SortAlogorithm sortAlgorithm;
	
	public int binarySearch(int[] data, int find) {
		int[] sortedData = sortAlgorithm.sort(data);
		//search for find
		return 5;//hardcoded for now
	}
}
