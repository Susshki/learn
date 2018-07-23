package com.sushma.spring.springBeanScopeExample_4.springBeanProxyExample;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
//only works if proxy is declared here. PersonDao is Singleton and JdbcConnection is new for every 'new' calls
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE,  proxyMode=ScopedProxyMode.TARGET_CLASS)
public class JdbcConnection {

	public JdbcConnection() {
	}
	
}
