package com.sushma.JPA2.JPAPagingAndSorting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.test.context.junit4.SpringRunner;

import com.sushma.JPA2.JPAPagingAndSorting.entities.Product;
import com.sushma.JPA2.JPAPagingAndSorting.repos.ProductRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaPagingAndSortingApplicationTests {
	
	@Autowired
	private ProductRepository productRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void findAllByPage() {
		Page<Product> page = productRepository.findAll(new PageRequest(0,2));
		page.forEach(p -> System.out.println(p));
		
	}
	
	@Test
	public void findAllSortByName() {
		Iterable<Product> products = productRepository.findAll(new Sort("name"));
		products.forEach(p -> System.out.println(p));
		
	}
	
	@Test
	public void findAllSortByNameDesc() {
		Iterable<Product> products = productRepository.findAll(new Sort(Direction.DESC, "name"));
		products.forEach(p -> System.out.println(p));
		
	}
	
	@Test
	public void findAllSortByNameAndPrice() {
		Iterable<Product> products = productRepository.findAll(new Sort(new Order(Direction.DESC, "name"), new Order(Direction.ASC, "price")));
		products.forEach(p -> System.out.println(p));
		
	}
	
	@Test
	public void findAllPageAndSortByNameDesc() {
		Page<Product> products = productRepository.findAll(new PageRequest(0, 2, Sort.Direction.DESC, "price"));
		products.forEach(p -> System.out.println(p));
		
	}
	
	@Test
	public void findAllByPriceGreaterThanPageSort() {
		Page<Product> products = productRepository.findAllByPriceGreaterThan(200d, new PageRequest(0, 2, Sort.Direction.DESC, "price"));
		products.forEach(p -> System.out.println(p));
		
	}
}


