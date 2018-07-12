package com.sushma.JPA2.JPAPagingAndSorting.repos;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.sushma.JPA2.JPAPagingAndSorting.entities.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer>{
	
	public Page<Product> findAllByPriceGreaterThan(Double price, Pageable pageable);
}
