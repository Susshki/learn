package com.sushma.JPA2.JPAFinalOrdersProj.repos;

import org.springframework.data.repository.CrudRepository;

import com.sushma.JPA2.JPAFinalOrdersProj.entities.Order;

public interface OrderRepository extends CrudRepository<Order, Integer>{

}
