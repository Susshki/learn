package com.sushma.juint.isbn.service;

public class ISBNValidationService {
	private final int ISBN_SHORT_LENGTH = 10;
	private final int ISBN_LONG_LENGTH = 13;
	
	public boolean validateISBN( String isbnNumber) {
		int isbnSize = isbnNumber.length();
		if(isbnSize == ISBN_SHORT_LENGTH) {
			return validateShortISBN(isbnNumber);
		}else if(isbnSize == ISBN_LONG_LENGTH) {
			return validateLongISBN(isbnNumber);
		}
	
		throw new NumberFormatException("iSBN size is invalid");
	}
	
	public boolean validateShortISBN(String isbnNumber) {
		int total = 0;
		int multiplier = ISBN_SHORT_LENGTH;
		
		for( int i =0; i<ISBN_SHORT_LENGTH; i++) {
			char c =isbnNumber.charAt(i);
			System.out.println("integer:"+c);
			if(!Character.isDigit(c)) {
				
				if( (i==9) && (c == 'X') ){
					total+=10;
				}else {		
					throw new NumberFormatException();
				}
			}else {
				total+=(Character.getNumericValue(c))*(multiplier--);
				System.out.println("total:"+total);
			}
		}		
		if(total%(11) == 0)return true;
		return false;
	}
	
	public boolean validateLongISBN(String isbnNumber) {
		final int  multiplier = 3;
		int total = 0;
		
		for(int i=0; i<ISBN_LONG_LENGTH; i++) {
			char c=  isbnNumber.charAt(i);
			
			if(i%2 == 0) {
				total+=(Character.getNumericValue(c));
			}else {
				total+=(Character.getNumericValue(c))*multiplier;
			}
		}
		
		if(total%10==0)return true;
		return false;
	}
}
