package com.sushma.JPA2.JPAFinalOrdersProj.repos;

import org.springframework.data.repository.CrudRepository;

import com.sushma.JPA2.JPAFinalOrdersProj.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{
	public Customer findById(int id);
}
