package com.sushma.spring.juintTesting.binarysearch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.sushma.spring.juintTesting.JuintTestingApplication;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=JuintTestingApplication.class)
public class BinarySearchImplTest {
	
	@Autowired
	private BinarySearchImpl binarySearchImpl;
	
	@Test
	public void binarySearchTest() {
		int result = binarySearchImpl.binarySearch(new int[] {1, 6, 9}, 4);
		assertEquals(5, result);
	}
	
	@Test
	public void binarySearchTest_ForNullData() {
		int result = binarySearchImpl.binarySearch(null, 4);
		assertEquals(5, result);
	}
}
