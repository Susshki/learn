package com.sushma.juint;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

//assetEquals(actual, result);
//assertTrue(conditionMustBeTrueToPass);
//assertFalse(conditionMustBeFalseToPass);
//assertArrayEquals(expectedArr, resultArr);
public class SomeServiceTest {

	@Autowired
	private SomeService someService ;
	
	@Test
	public void testSum() {
		assertEquals(6, someService.addTwoNums(1, 5));
	}
	
	@Before
	public void xyz() {
		System.out.println("BeforeTest");
	}
	
	@After
	public void abc() {
		System.out.println("AfterTest");
	}
	
	@AfterClass
	public static void abcd() {
		System.out.println("AfterClass");
	}
	
	@BeforeClass
	public static void abce() {
		System.out.println("BeforeClass");
	}
}
