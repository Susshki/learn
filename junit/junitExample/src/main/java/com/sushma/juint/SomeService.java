package com.sushma.juint;

import org.springframework.stereotype.Component;

@Component
public class SomeService {
	
	public int addTwoNums(int num1, int num2) {
		return num1+num2;
	}
}
