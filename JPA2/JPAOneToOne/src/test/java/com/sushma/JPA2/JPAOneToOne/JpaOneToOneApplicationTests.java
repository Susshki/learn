package com.sushma.JPA2.JPAOneToOne;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sushma.JPA2.JPAOneToOne.entities.License;
import com.sushma.JPA2.JPAOneToOne.entities.Person;
import com.sushma.JPA2.JPAOneToOne.repos.LicenseRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaOneToOneApplicationTests {
	
	@Autowired
	private LicenseRepository licenseRepo;

	@Test
	public void contextLoads() {
	}

	@Test
	public void saveLicense() {
		License license = new License();
		license.setLicenseType("C");
		
		Person person = new Person();
		person.setName("Sushma");
		license.setPerson(person);
		
		licenseRepo.save(license);
		
	}
}
