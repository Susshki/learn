package com.sushma.springboot.webProjFinalProj14.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.sushma.springboot.webProjFinalProj14.dao.PlayerRepository;
import com.sushma.springboot.webProjFinalProj14.model.Player;
import com.sushma.springboot.webProjFinalProj14.model.Team;

@Service
public class PlayerService {
	
	@Autowired
	private PlayerRepository playerRepository;
	
	public Iterable<Player> getAllPlayers(){
		return playerRepository.findAll();
	}
	
	public Iterable<Player> getPlayersByTeam(int teamId){
		return playerRepository.findByTeam(new Team(teamId));
	}
	
	public void savePlayer(@RequestBody Player player) {
		playerRepository.save(player);
	}

}
