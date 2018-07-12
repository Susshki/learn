package com.sushma.JPA2.JPATransaction.repos;

import org.springframework.data.repository.CrudRepository;

import com.sushma.JPA2.JPATransaction.entities.BankAccount;

public interface BankAccountRepository extends CrudRepository<BankAccount, Integer>{
	public BankAccount findById(int id); 
}
