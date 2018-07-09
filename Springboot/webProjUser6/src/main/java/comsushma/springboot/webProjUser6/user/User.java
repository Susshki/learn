package comsushma.springboot.webProjUser6.user;

import java.util.Date;

public class User {
	private int id;
	private String name;
	private Date dob;

	//we need this for POSt request to create user. For the Jackson to map the  RequestBody to User
	public User() {

	}
	
	public User(int id, String name, Date dob) {
		this.id = id;
		this.name = name;
		this.dob = dob;
	}
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}
}
