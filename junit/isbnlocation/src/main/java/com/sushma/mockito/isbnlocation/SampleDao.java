package com.sushma.mockito.isbnlocation;

public class SampleDao implements RetrieveBookI{

	public Book lookupBook(String isbn) {
		return new Book("1234567890", "The Beginning", "Baahubali");
	}

}
