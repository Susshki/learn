package com.sushma.spring.aopExamples_102.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sushma.spring.aopExamples_102.aop.TrackTime;
import com.sushma.spring.aopExamples_102.dao.Dao1;

@Service
public class Service1 {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Dao1 dao1;

	@TrackTime
	public String service1() {
		logger.info("Service1");
		return dao1.getData();
	}
}
