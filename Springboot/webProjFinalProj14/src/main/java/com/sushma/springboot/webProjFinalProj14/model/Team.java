package com.sushma.springboot.webProjFinalProj14.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Team")
public class Team implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="team_id")
	private int id;
	
	@Column(name="team_country", nullable=false)
	private String country;

	public Team() {
		super();
	}

	public Team(int id) {
		super();
		this.id = id;
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
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Team [id=" + id + ", country=" + country + "]";
	}
	
}
