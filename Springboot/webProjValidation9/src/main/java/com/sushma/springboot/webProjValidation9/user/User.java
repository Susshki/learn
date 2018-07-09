package com.sushma.springboot.webProjValidation9.user;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {
	
	@NotNull
	@NotBlank
	@Pattern(regexp ="[A-Za-z0-9]{5}|[A-Za-z0-9]{7}", message="Ivalid userId")
	private String userId;
	
	@NotNull(message="name cannot be null")
	@NotBlank(message="name cannot be blank")
	@NotEmpty(message="name cannot be empty")
	//@Size(max=30, message ="Name cannot be more than 30 charaters")
	@Pattern(regexp ="[A-Za-z]{0,30}", message="name must be Alphabetic characters")
	private String name;
	
	@NotNull
	@Past(message="Date of birth must be in the past")
	private Date dob;
	
	@NotNull
	@NotBlank
	@Email(message ="Not a valid Email address.")
	private String emailAddress;
	
	@NotNull
	@NotBlank
	@Pattern(regexp = "[A|B]{1}", message="usertype is invalid")
	private String userType;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userId, String name, Date dob,String emailAddress, String userType) {
		super();
		this.userId = userId;
		this.name = name;
		this.dob = dob;
		this.emailAddress = emailAddress;
		this.userType = userType;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}
	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	/**
	 * @return the userType
	 */
	public String getUserType() {
		return userType;
	}
	/**
	 * @param userType the userType to set
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", dob=" + dob + ", emailAddress=" + emailAddress
				+ ", userType=" + userType + "]";
	}
}
