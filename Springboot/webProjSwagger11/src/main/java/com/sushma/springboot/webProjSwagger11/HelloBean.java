package com.sushma.springboot.webProjSwagger11;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description ="All about User")
public class HelloBean {
	
	@ApiModelProperty(notes ="Must bea String")
	private String message;

	public HelloBean(String message) {
		super();
		this.message = message;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HelloBean [message=" + message + "]";
	}
	
	
}
