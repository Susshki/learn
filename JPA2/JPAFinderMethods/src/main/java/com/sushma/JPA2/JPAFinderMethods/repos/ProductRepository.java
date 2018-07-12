package com.sushma.JPA2.JPAFinderMethods.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sushma.JPA2.JPAFinderMethods.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
	
	public Iterable<Product> findByName(String name);
	public Iterable<Product> findByNameAndPrice(String name, Double price);
	
	
	public Iterable<Product> findByPriceGreaterThan(Double price);
	
	public Iterable<Product> findByPriceBetween(Double price1, Double price2);
	
	public Iterable<Product> findByDescLike(String desc);
	
	public boolean existsById(int id);
	
	public Iterable<Product> findByIdIn(List<Integer> ids);
	

}
