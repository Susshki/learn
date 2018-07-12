package com.sushma.JPA2.JPAInheritanceTablePerConcreteClass;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sushma.JPA2.JPAInheritanceTablePerConcreteClass.entities.BankCheck;
import com.sushma.JPA2.JPAInheritanceTablePerConcreteClass.entities.CreditCard;
import com.sushma.JPA2.JPAInheritanceTablePerConcreteClass.repos.PaymentRepository;

@SpringBootApplication
public class JpaInheritanceTablePerConcreteClassApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(JpaInheritanceTablePerConcreteClassApplication.class, args);
	}

}
