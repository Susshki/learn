package com.sushma.JPA2.JPAManyToMany.repos;

import org.springframework.data.repository.CrudRepository;

import com.sushma.JPA2.JPAManyToMany.entities.Programmer;

public interface ProgrammerRepository extends CrudRepository<Programmer, Integer> {

}
