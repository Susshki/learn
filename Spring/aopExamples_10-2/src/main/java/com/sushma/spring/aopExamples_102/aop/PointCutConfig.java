package com.sushma.spring.aopExamples_102.aop;

import org.aspectj.lang.annotation.Pointcut;

public class PointCutConfig {
	
	@Pointcut("@annotation(com.sushma.spring.aopExamples_102.aop.TrackTime)")
	public void timeTrackPointCut() {
		
	}
}
