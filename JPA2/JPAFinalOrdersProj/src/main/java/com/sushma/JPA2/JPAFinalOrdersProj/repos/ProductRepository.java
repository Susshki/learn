package com.sushma.JPA2.JPAFinalOrdersProj.repos;

import org.springframework.data.repository.CrudRepository;

import com.sushma.JPA2.JPAFinalOrdersProj.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
	public Product findById(int id);
}
