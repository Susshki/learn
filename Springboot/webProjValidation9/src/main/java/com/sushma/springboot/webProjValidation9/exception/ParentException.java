package com.sushma.springboot.webProjValidation9.exception;

public class ParentException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorId;

	public ParentException(String errorId, String message) {
		super(message);
		this.errorId = errorId;
	}

	/**
	 * @return the errorId
	 */
	public String getErrorId() {
		return errorId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ParentException [errorId=" + errorId + "]";
	}
}
