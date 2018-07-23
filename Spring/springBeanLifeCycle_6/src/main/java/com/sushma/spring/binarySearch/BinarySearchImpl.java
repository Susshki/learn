package com.sushma.spring.binarySearch;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class BinarySearchImpl {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public int binarySearch(int[] dataArray, int searchElemeent) {
		return 3;
	}
	
	@PostConstruct
	public void postConstruct() {
		logger.info("Post Construct");
	}
	
	@PreDestroy
	/**
	 * You can see it when Dev tools kick in
	 */
	public void preDestroy() {
		logger.info("Pre Destroy");
	}
	
}
