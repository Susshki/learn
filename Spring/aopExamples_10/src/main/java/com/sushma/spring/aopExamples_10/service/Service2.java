package com.sushma.spring.aopExamples_10.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sushma.spring.aopExamples_10.dao.Dao2;

@Service
public class Service2 {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Dao2 dao2;

	public String service2() {
		logger.info("Service2");
		return dao2.getData();
	}
}
