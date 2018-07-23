package com.sushma.spring.mockitoUnitTestingExample.somebusiness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SomeBusiness {
	
	@Autowired
	private SomeDao someDao;
	
	public int getGreatestValue() {
		int[] data = someDao.retrieveData();
		int greatest = 0;
		
		for(int value :data) {
			if(value>greatest) {
				greatest = value;
			}
		}
		return greatest;
	}
}
