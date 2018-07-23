package com.sushma.spring.aopExamples_10.dao;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {
	
	public String getData() {
		return "DAO1";
	}
}
