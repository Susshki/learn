package com.sushma.JPA2.JPAOneToMany.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.sushma.JPA2.JPAOneToMany.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
