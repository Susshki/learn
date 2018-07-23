package com.sushma.spring.aopExamples_102.aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AopImpl {

	private Logger logger = LoggerFactory.getLogger(AopImpl.class); 

	/*@Before(value="com.sushma.spring.aopExamples_10.aop.PointCutConfig.daoLayerPointCut()")
	public void before(Joinpoint jointPoint) {
		logger.info("##################################Joint Point:"+jointPoint);
	}*/
	
	
	@AfterReturning(
			value="com.sushma.spring.aopExamples_10.aop.PointCutConfig.daoLayerPointCut()",
			returning="result")
	public void afterReturning(Joinpoint jointPoint, Object result) {
		logger.info("##################################AfterReturning JointPoint:"+jointPoint+" RESULT:"+result);
	}
	
	@AfterThrowing(value="com.sushma.spring.aopExamples_10.aop.PointCutConfig.daoLayerPointCut()",
			throwing="exception")
	public void afterThrowing(Joinpoint jointPoint, Exception exception) {
		logger.info("##################################AfterThrowing JointPoint:"+jointPoint+ "Exception"+exception);
	}
	
	@After(value="com.sushma.spring.aopExamples_10.aop.PointCutConfig.daoLayerPointCut()")
	public void afterThrowing(Joinpoint jointPoint) {
		logger.info("##################################AfterThrowing JointPoint:"+jointPoint);
	}
}
