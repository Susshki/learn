package com.sushma.springboot.webProjFinalProj14.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sushma.springboot.webProjFinalProj14.model.Player;
import com.sushma.springboot.webProjFinalProj14.model.Team;
import com.sushma.springboot.webProjFinalProj14.service.PlayerService;
import com.sushma.springboot.webProjFinalProj14.service.TeamService;

@RestController
@RequestMapping("/soccer")
public class SoccerController {
	
	@Autowired
	private PlayerService playerService =null;
	
	@Autowired
	private TeamService teamService =null;
	
	@GetMapping("/getAllPlayers")
	public Iterable<Player> getAllPlayers(){
		return playerService.getAllPlayers();		
	}
	
	@GetMapping("/getPlayersByTeam/{teamId}")
	public Iterable<Player> getPlayersByTeam(@PathVariable int teamId){
		return playerService.getPlayersByTeam(teamId);		
	}

	@PostMapping("/savePlayer")
	public void savePlayer(@RequestBody Player player) {
		playerService.savePlayer(player);
	}
	
	@GetMapping("/getTeams")
	public Iterable<Team> getTeams(){
		return teamService.getTeams();
	}
	
	@GetMapping("/getTeam/{id}")
	public Team getTeam(@PathVariable int id){
		Optional<Team> teamOpt =  teamService.getTeam(id);
		if(!teamOpt.isPresent()) {
			throw new RuntimeException("Team not found!");
		}
		
		return teamOpt.get();
	}
	
	@DeleteMapping("/deleteTeam/{id}")
	public void deleteTeam(@PathVariable int id){
		teamService.deleteTeam(id);
	}
	
	@PostMapping("/saveTeam")
	public void saveTeam(@RequestBody Team team){
		teamService.saveTeam(team);
	}
}
