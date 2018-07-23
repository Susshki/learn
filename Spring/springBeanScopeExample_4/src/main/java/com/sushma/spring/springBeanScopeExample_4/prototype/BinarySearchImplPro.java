package com.sushma.spring.springBeanScopeExample_4.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImplPro {
	 
	@Autowired
	private SortAlgorithmPro sortAlgorithm; //bnyname - is Overrideen by the @Qualifier annotation
	
	
	public boolean  binarySearchImpl(int[] dataArray, int search) {
		
		//sort the data
		int[] sortedData = sortAlgorithm.sort(dataArray);
		//perform search		
		return true;//hardcoded
	}
}
