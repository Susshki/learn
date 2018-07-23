package com.sushma.spring.springBeanScopeExample_4.singleton;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm{

	@Override
	public int[] sort(int[] dataArray) {
		// TODO Auto-generated method stub
		System.out.println("\n ################################BubbleSortAlogorithm");
		return null;
	}

}
