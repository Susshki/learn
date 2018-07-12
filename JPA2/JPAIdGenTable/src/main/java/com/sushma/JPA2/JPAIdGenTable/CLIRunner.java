package com.sushma.JPA2.JPAIdGenTable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sushma.JPA2.JPAIdGenTable.entities.Employee;
import com.sushma.JPA2.JPAIdGenTable.repos.EmployeeRepository;

@Component
public class CLIRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Employee emp1 = new Employee("Sushma", "Uppuluri", "sushma@gmail.com", "FULLTIME");
		employeeRepository.save(emp1);
	}

}
