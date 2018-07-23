package com.sushma.spring.aopExamples_10.aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AopImpl {

	private Logger logger = LoggerFactory.getLogger(AopImpl.class); 
	
	@Around(value="com.sushma.spring.aopExamples_10.aop.PointCutConfig.daoLayerPointCut()")
	public void around(Joinpoint jointPoint) throws Throwable{
		long startTime = System.currentTimeMillis();
		jointPoint.proceed();
		long timeTaken = System.currentTimeMillis()-startTime;
		logger.info("##################################AfterThrowing JointPoint:"+jointPoint+timeTaken);
	}
}
