package com.sushma.springboot.webProjContentNego10;

public class HelloBean {
	 private String message;
	 
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	public HelloBean(String message) {
		super();
		this.message = message;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HelloBean [message=" + message + "]";
	} 
	 
}
