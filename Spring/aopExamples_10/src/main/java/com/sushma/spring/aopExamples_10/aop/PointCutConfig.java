package com.sushma.spring.aopExamples_10.aop;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class PointCutConfig {
	
	//@Pointcut(value="execution (* com.sushma.spring.aopExamples_10.dao.Dao1.*(..))")
	@Pointcut(value="execution(* com.sushma.spring.aopExamples_10.dao.Dao1.getData())" )
	public void daoLayerPointCut() {
		
	}
}
