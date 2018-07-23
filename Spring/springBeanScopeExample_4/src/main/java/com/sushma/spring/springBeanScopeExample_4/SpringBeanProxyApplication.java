package com.sushma.spring.springBeanScopeExample_4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sushma.spring.springBeanScopeExample_4.springBeanProxyExample.PersonDao;

@SpringBootApplication
public class SpringBeanProxyApplication {
	
	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(SpringBeanProxyApplication.class, args);
		
		//PersonDao is Singleton. But we made the Dependent jdbcConnection bean scope as PROTOTYPE with proxyMode
		PersonDao bean1 = appContext.getBean(PersonDao.class);
		System.out.println(bean1);		
		System.out.println(bean1.getJdbcConnection());
		
		PersonDao bean2 = appContext.getBean(PersonDao.class);
		System.out.println(bean2);		
		System.out.println(bean2.getJdbcConnection());
		
	}
	
}
