package com.sushma.spring.springBeanScopeExample_4.prototype;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithmPro implements SortAlgorithmPro{

	@Override
	public int[] sort(int[] dataArray) {
		// TODO Auto-generated method stub
		System.out.println("\n ################################BubbleSortAlogorithm");
		return null;
	}

}
