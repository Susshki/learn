package com.sushma.spring.autowireByQualifier;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm{

	@Override
	public int[] sort(int[] dataArray) {
		// TODO Auto-generated method stub
		System.out.println("\n ################################BubbleSortAlogorithm");
		return null;
	}

}
