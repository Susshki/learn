package com.sushma.spring.juintTesting.binarysearch;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlogorithm implements SortAlogorithm {

	@Override
	public int[] sort(int[] data) {
		return null;
	}

}
