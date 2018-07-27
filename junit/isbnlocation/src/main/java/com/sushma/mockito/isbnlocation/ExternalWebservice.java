package com.sushma.mockito.isbnlocation;

public class ExternalWebservice implements RetrieveBookI{

	public Book lookupBook(String isbn) {
		return new Book("1234567890", "The beginning", "Baahubali");
	}

}
