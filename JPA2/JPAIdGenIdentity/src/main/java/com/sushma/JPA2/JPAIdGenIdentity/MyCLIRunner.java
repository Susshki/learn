package com.sushma.JPA2.JPAIdGenIdentity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sushma.JPA2.JPAIdGenIdentity.entities.Customer;
import com.sushma.JPA2.JPAIdGenIdentity.repos.CustomerRepository;

@Component
public class MyCLIRunner implements CommandLineRunner{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Customer customer = new Customer("Kiran", "Kiran@gmail.com");
		customerRepository.save(customer);		
	}

}
