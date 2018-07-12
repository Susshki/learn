package com.sushma.JPA2JPAInheritanceSingleTable;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sushma.JPA2JPAInheritanceSingleTable.entities.BankCheck;
import com.sushma.JPA2JPAInheritanceSingleTable.entities.CreditCard;
import com.sushma.JPA2JPAInheritanceSingleTable.repos.PaymentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaInheritanceSingleTableApplicationTests {
	
	@Autowired
	private PaymentRepository paymentRepository;
	
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void saveCCPayment() {
		CreditCard cc = new CreditCard();
		cc.setId(1000);
		cc.setAmount(2000d);
		cc.setCardNumber("1234567890");		
		paymentRepository.save(cc);
	}
	
	@Test
	public void saveCheckPayment() {
		BankCheck cc = new BankCheck();
		cc.setId(1001);
		cc.setAmount(20d);
		cc.setCheckNumber("1234567890");	
		paymentRepository.save(cc);
	}
	
}
