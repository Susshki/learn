package com.sushma.springboot.webProjFinalProj14.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sushma.springboot.webProjFinalProj14.model.Player;
import com.sushma.springboot.webProjFinalProj14.model.Team;

public interface PlayerRepository extends JpaRepository<Player, Integer>{
	public Iterable<Player> findByTeam(Team team);
}
