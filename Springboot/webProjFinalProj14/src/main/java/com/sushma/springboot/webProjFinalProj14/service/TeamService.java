package com.sushma.springboot.webProjFinalProj14.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sushma.springboot.webProjFinalProj14.dao.TeamRepository;
import com.sushma.springboot.webProjFinalProj14.model.Team;

@Service
public class TeamService {
	@Autowired
	private TeamRepository teamRepository;
	
	public void saveTeam(Team team){
		teamRepository.save(team);
	}
	
	public Iterable<Team> getTeams() {
		return teamRepository.findAll();
	}
	
	public Optional<Team> getTeam(int id) {
		return teamRepository.findById(id);
	}
	
	public void deleteTeam(int id){
		teamRepository.deleteById(id);
	}
}
