package com.sushma.springboot.webProjExcerciseEx8.exception;

public class ExceptionResponse {
	private String errID;
	private String message;
	private String details;
	
	
	public ExceptionResponse(String errID, String message, String details) {
		super();
		this.errID = errID;
		this.message = message;
		this.details = details;
	}
	
	/**
	 * @return the errID
	 */
	public String getErrID() {
		return errID;
	}
	/**
	 * @param errID the errID to set
	 */
	public void setErrID(String errID) {
		this.errID = errID;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the details
	 */
	public String getDetails() {
		return details;
	}
	/**
	 * @param details the details to set
	 */
	public void setDetails(String details) {
		this.details = details;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ExceptionResponse [errID=" + errID + ", message=" + message + ", details=" + details + "]";
	}
	
}
