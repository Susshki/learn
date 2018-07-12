package com.sushma.JPA2JPAInheritanceSingleTable.repos;

import org.springframework.data.repository.CrudRepository;

import com.sushma.JPA2JPAInheritanceSingleTable.entities.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Long>{

}
