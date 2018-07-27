package com.sushma.mockito.isbnlocation;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.mockito.Mockito;

public class _StoreManager {
	RetrieveBookI webService = mock(ExternalWebservice.class);
	RetrieveBookI dataService = mock(SampleDao.class);
	
	@Test
	public void testBookLocateRetrievalUsingEWS() {
		Mockito.when(webService.lookupBook("1234567890")).thenReturn(new Book("1234567890", "The Beginning", "Baahubali"));
		Mockito.when(dataService.lookupBook("1234567890")).thenReturn(null);
		
		StoreManager storeManager = new StoreManager(webService, dataService);
		String actual = storeManager.getBookLocation("1234567890");
		assertEquals("7890B2", actual);		
	}

	@Test
	public void testBookLocateRetrievalUsingDao() {
		Mockito.when(webService.lookupBook("1234567890")).thenReturn(null);
		Mockito.when(dataService.lookupBook("1234567890")).thenReturn(new Book("1234567890", "The Beginning", "Baahubali"));
		
		StoreManager storeManager = new StoreManager(webService, dataService);
		String actual = storeManager.getBookLocation("1234567890");
		assertEquals("7890B2", actual);		
	}	
}
