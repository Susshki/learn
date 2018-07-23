package com.sushma.spring.autowireByPrimary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm{

	@Override
	public int[] sort(int[] dataArray) {
		// TODO Auto-generated method stub
		System.out.println("\n ################################QuickSortAlogorithm");
		return null;
	}

}
