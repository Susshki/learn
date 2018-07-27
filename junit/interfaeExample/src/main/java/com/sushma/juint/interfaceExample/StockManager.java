package com.sushma.juint.interfaceExample;

public class StockManager {
	private DataRetrivalI webService;
	private DataRetrivalI someDao;	
	
	public StockManager(DataRetrivalI webService, DataRetrivalI someDao) {
		super();
		this.webService = webService;
		this.someDao = someDao;
	}
	public DataRetrivalI getWebService() {
		return webService;
	}

	public DataRetrivalI getSomeDao() {
		return someDao;
	}

	public String locateBook(String isbn) {		
		Book book = someDao.getBook(isbn);
		if(book == null) {
			book = webService.getBook(isbn);
		}
		StringBuilder builder = new StringBuilder();
		builder.append(isbn.substring(isbn.length()-4));
		builder.append(book.getAuthor().charAt(0));
		builder.append(book.getTitle().split(" " ).length);
		return builder.toString();	
	}
}
