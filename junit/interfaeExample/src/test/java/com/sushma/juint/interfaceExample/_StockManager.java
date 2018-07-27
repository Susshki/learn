package com.sushma.juint.interfaceExample;

import static org.junit.Assert.*;

import org.junit.Test;

public class _StockManager {	
	@Test
	public void testWebServiceBookService() {
		DataRetrivalI webService = new DataRetrivalI() {			
			public Book getBook(String isbn) {
				return new Book("1234567890", "Baahubali", "The Beginning");
			}
		};
		
		DataRetrivalI dataService = new DataRetrivalI() {			
			public Book getBook(String isbn) {
				return null;
			}
		};
		
		StockManager lookupService = new StockManager( webService, dataService);
		String actual  = lookupService.locateBook("1234567890");
		System.out.println("location"+actual);
		assertEquals("7890B2", actual);		
	}
	
	@Test
	public void testDaoBookService() {
		DataRetrivalI webService = new DataRetrivalI() {			
			public Book getBook(String isbn) {
				return new Book("1234567890", "Baahubali", "The Beginning end");
			}
		};
		
		DataRetrivalI dataService = new DataRetrivalI() {			
			public Book getBook(String isbn) {
				return new Book("1234567890", "Baahubali", "The Beginning");
			}
		};
		
		StockManager lookupService = new StockManager( webService, dataService);
		String actual  = lookupService.locateBook("1234567890");
		System.out.println("location"+actual);
		assertEquals("7890B2", actual);		
	}

}

