package com.sushma.mockito.isbnlocation;

public class StoreManager {
	private RetrieveBookI webService;
	private RetrieveBookI dataService;
	
	public StoreManager(RetrieveBookI webService, RetrieveBookI dataService) {
		super();
		this.webService = webService;
		this.dataService = dataService;
	}
	
	public String getBookLocation(String isbn) {
		Book book = dataService.lookupBook(isbn);
		if(book == null) {
			book = webService.lookupBook(isbn);
		}
		
		StringBuilder builder = new StringBuilder();
		builder.append(isbn.substring(isbn.length()-4));
		builder.append(book.getAuthor().charAt(0));
		builder.append(book.getTitle().split(" ").length);
		
		return builder.toString();
	}
}
