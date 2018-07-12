package com.sushma.JPA2.JPAInheritanceJoined.repos;

import org.springframework.data.repository.CrudRepository;

import com.sushma.JPA2.JPAInheritanceJoined.entities.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Long> {

}
