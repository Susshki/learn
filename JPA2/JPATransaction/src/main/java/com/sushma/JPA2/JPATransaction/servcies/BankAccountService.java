package com.sushma.JPA2.JPATransaction.servcies;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sushma.JPA2.JPATransaction.entities.BankAccount;
import com.sushma.JPA2.JPATransaction.repos.BankAccountRepository;

@Service
public class BankAccountService {
	@Autowired
	private BankAccountRepository repository;
	
	
	@Transactional
	public void transfer(Double amount) {
		BankAccount obamaAccount = repository.findById(1);
		double obamaBal = obamaAccount.getBalance();
		obamaAccount.setBalance(obamaBal-amount);
		repository.save(obamaAccount);
		
		if(true) {
			throw new RuntimeException();
		}
		
		BankAccount trumpAccount = repository.findById(2);
		double trumpBal = trumpAccount.getBalance();
		trumpAccount.setBalance(trumpBal+amount);
		repository.save(trumpAccount);
	}
}
