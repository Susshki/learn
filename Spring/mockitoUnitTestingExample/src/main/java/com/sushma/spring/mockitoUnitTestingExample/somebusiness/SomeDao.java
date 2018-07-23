package com.sushma.spring.mockitoUnitTestingExample.somebusiness;

import org.springframework.stereotype.Repository;

@Repository
public class SomeDao {

	public int[] retrieveData() {
		return new int[] {7,3,1};
	}
}
