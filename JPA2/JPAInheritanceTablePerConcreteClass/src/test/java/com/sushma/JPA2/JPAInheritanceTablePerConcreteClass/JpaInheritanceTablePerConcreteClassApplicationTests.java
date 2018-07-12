package com.sushma.JPA2.JPAInheritanceTablePerConcreteClass;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sushma.JPA2.JPAInheritanceTablePerConcreteClass.entities.BankCheck;
import com.sushma.JPA2.JPAInheritanceTablePerConcreteClass.entities.CreditCard;
import com.sushma.JPA2.JPAInheritanceTablePerConcreteClass.repos.PaymentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaInheritanceTablePerConcreteClassApplicationTests {

	@Autowired
	private PaymentRepository paymentRepo;
	
	@Test
	public void contextLoads() {
	}

	
	@Test
	public void saveCCPayment() {
		CreditCard cc = new CreditCard();
		cc.setId(300);
		cc.setAmount(1000);
		cc.setCardNumber("1234567890");		
		paymentRepo.save(cc);
		
	}
	
	@Test
	public void saveCheckPayment() {
		BankCheck cc = new BankCheck();
		cc.setId(300);
		cc.setAmount(1000);
		cc.setCheckNumber("1234567890");
		
		paymentRepo.save(cc);
		
	}
}
