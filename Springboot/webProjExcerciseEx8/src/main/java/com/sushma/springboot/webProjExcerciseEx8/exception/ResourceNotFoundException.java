package com.sushma.springboot.webProjExcerciseEx8.exception;

public class ResourceNotFoundException extends ParentException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 
	public ResourceNotFoundException(String errorId, String message) {
		super(errorId, message);
	}
}
