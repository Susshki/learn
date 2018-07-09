package com.sushma.springboot.dependencyinjectionwospring2;

public class BinarySearchImpl {
	private SortAlgorithm sortAlgorithm = null;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}
	
	public int binarySearchImpl(int[] numbers,  int num){
		int[] numbersSorted  =  sortAlgorithm.sort(numbers);
		
		//search and then return index
		return 3;
	}
}
