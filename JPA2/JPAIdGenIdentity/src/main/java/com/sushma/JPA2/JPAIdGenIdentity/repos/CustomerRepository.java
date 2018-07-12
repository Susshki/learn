package com.sushma.JPA2.JPAIdGenIdentity.repos;

import org.springframework.data.repository.CrudRepository;

import com.sushma.JPA2.JPAIdGenIdentity.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
