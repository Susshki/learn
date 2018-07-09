package com.sushma.springboot.webProjJPASpringData2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sushma.springboot.webProjJPASpringData2.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
