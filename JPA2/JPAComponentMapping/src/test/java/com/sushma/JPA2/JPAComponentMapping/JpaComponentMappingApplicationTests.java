package com.sushma.JPA2.JPAComponentMapping;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sushma.JPA2.JPAComponentMapping.entities.Address;
import com.sushma.JPA2.JPAComponentMapping.entities.Employee;
import com.sushma.JPA2.JPAComponentMapping.repos.EmppolyeeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaComponentMappingApplicationTests {

	@Autowired
	private EmppolyeeRepository employeeRepo;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void saveEmployee() {
		Employee emp1 = new Employee(1, "Sushma U", new Address("1234 unknown stree", "Alpha", "GA", "46789"));
		employeeRepo.save(emp1);
		
	}
}
