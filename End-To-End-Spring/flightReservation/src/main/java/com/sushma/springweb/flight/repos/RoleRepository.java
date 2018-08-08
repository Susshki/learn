package com.sushma.springweb.flight.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sushma.springweb.flight.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
