package com.sushma.JPA2.JPACrudOperations.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.sushma.JPA2.JPACrudOperations.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
