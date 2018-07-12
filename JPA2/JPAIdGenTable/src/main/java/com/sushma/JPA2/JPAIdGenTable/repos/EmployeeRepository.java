package com.sushma.JPA2.JPAIdGenTable.repos;

import org.springframework.data.repository.CrudRepository;

import com.sushma.JPA2.JPAIdGenTable.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
