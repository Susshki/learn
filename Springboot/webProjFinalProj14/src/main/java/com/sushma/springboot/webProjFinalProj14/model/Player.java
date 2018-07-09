package com.sushma.springboot.webProjFinalProj14.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Player")
public class Player implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="player_id")
	private int id;
	
	@Column(name="player_name", nullable=false)
	private String name;
	
	@Column(name="shirt_number", nullable=false)
	private int shirtNumber;
	
	@ManyToOne
	@JoinColumn(name="team_id", nullable=false)
	private Team team;

	public Player() {
		super();
	}

	/**
	 * @return the playerId
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param playerId the playerId to set
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
	 * @return the shirtNumber
	 */
	public int getShirtNumber() {
		return shirtNumber;
	}

	/**
	 * @param shirtNumber the shirtNumber to set
	 */
	public void setShirtNumber(int shirtNumber) {
		this.shirtNumber = shirtNumber;
	}

	/**
	 * @return the team
	 */
	public Team getTeam() {
		return team;
	}

	/**
	 * @param team the team to set
	 */
	public void setTeam(Team team) {
		this.team = team;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Player [playerId=" + id + ", name=" + name + ", shirtNumber=" + shirtNumber + ", team=" + team
				+ "]";
	}
	
}
