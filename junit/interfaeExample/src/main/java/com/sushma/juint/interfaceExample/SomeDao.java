package com.sushma.juint.interfaceExample;

public class SomeDao implements DataRetrivalI {
	public Book getBook(String isbn) {
		return new Book("1234567890", "Baahubali", "location");
	}
}
