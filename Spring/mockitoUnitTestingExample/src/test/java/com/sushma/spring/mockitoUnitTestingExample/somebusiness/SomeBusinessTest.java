package com.sushma.spring.mockitoUnitTestingExample.somebusiness;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessTest {
	
	@InjectMocks
	private SomeBusiness someBusiness;
	
	@Mock	
	private SomeDao someDao;
	
	@Test
	public void someBusinessTest() {
		Mockito.when(someDao.retrieveData()).thenReturn(new int[] {9,3,8});
		int result = someBusiness.getGreatestValue();
		assertEquals(9, result);
	}
	
}
