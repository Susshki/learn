package com.sushma.spring.autowireByQualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("'quick")
public class QuickSortAlgorithm implements SortAlgorithm{

	@Override
	public int[] sort(int[] dataArray) {
		// TODO Auto-generated method stub
		System.out.println("\n ################################QuickSortAlogorithm");
		return null;
	}

}
