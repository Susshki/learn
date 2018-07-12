package com.sushma.JPA2.JPAInheritanceTablePerConcreteClass.repos;

import org.springframework.data.repository.CrudRepository;

import com.sushma.JPA2.JPAInheritanceTablePerConcreteClass.entities.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Long>{

}
