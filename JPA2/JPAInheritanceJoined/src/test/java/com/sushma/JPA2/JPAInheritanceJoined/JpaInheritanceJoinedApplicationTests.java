package com.sushma.JPA2.JPAInheritanceJoined;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sushma.JPA2.JPAInheritanceJoined.entities.BankCheck;
import com.sushma.JPA2.JPAInheritanceJoined.entities.CreditCard;
import com.sushma.JPA2.JPAInheritanceJoined.repos.PaymentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaInheritanceJoinedApplicationTests {

	@Autowired
	private PaymentRepository paymentRepository;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void saveCCPaymnet() {
		CreditCard cc= new CreditCard();		
		cc.setId(123);
		cc.setAmount(1000);
		cc.setCardNumber("12345623456");
		
		paymentRepository.save(cc);
		
	}
	
	@Test
	public void saveCheckPayment() {
		BankCheck cc= new BankCheck();		
		cc.setId(134);
		cc.setAmount(1000);
		cc.setCheckNumber("12345623456");
		
		paymentRepository.save(cc);
		
	}
}
