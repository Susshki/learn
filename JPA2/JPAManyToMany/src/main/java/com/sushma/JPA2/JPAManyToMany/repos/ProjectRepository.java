package com.sushma.JPA2.JPAManyToMany.repos;

import org.springframework.data.repository.CrudRepository;

import com.sushma.JPA2.JPAManyToMany.entities.Project;

public interface ProjectRepository extends CrudRepository<Project, Integer> {
	public Project findById(int id);
}
