package com.sushma.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sushma.juint.isbn.service.ISBNValidationService;

public class _ISBNVaidationService {

	private ISBNValidationService validatorService = new ISBNValidationService();

	@Test
	public void checkValid10DigitISBN() {
		boolean result = validatorService.validateISBN("0323088546");
		assertTrue(result);		
	}

	@Test
	public void checkInValid10DigitISBN() {
		boolean result = validatorService.validateISBN("0323088547");
		assertFalse(result);
	}

	@Test(expected = NumberFormatException.class)
	public void checkLength10DigitISBN() {
		validatorService.validateISBN("323088547");
	}

	@Test(expected = NumberFormatException.class)
	public void checkNonNumericISBN() {
		validatorService.validateISBN("helloworld");
	}

	@Test
	public void checkIsbnValidForEndingInX() {
		assertTrue(validatorService.validateISBN("097522980X"));
	}
	
	@Test
	public void checkValid13DigitISBN() {
		boolean result = validatorService.validateISBN("9780500300909");
		assertTrue(result);		
	}

}
