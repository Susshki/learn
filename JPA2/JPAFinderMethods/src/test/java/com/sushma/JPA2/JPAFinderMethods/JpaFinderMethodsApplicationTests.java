package com.sushma.JPA2.JPAFinderMethods;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sushma.JPA2.JPAFinderMethods.entities.Product;
import com.sushma.JPA2.JPAFinderMethods.repos.ProductRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaFinderMethodsApplicationTests {

	@Autowired
	ProductRepository repository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void saveProduct() {
		Product product = new Product(6, "iPad 3", "iPad for everyone", 700d);
		repository.save(product);
	}
	
	@Test
	public void findProducts() {
		Iterable<Product> products = repository.findAll();
		products.forEach(p ->System.out.println(p));
	}

	@Test
	public void findProductById() {
		repository.findById(1);
	}

	@Test
	public void findByName() {
		Iterable<Product> products = repository.findByName("iWatch");
		products.forEach(p -> System.out.println(p));
		
	}

	@Test
	public void findByPriceGreaterThan() {
		Iterable<Product> products = repository.findByPriceGreaterThan(500d);
		products.forEach(p -> System.out.println(p));
	}

	@Test
	public void findByPriceBetween() {
		Iterable<Product> products = repository.findByPriceBetween(500d, 1500d);
		products.forEach(p -> System.out.println(p));
	}

	@Test
	public void findByDescLike() {
		Iterable<Product> products = repository.findByDescLike("%Phone%");
		products.forEach(p -> System.out.println(p));
	}

	@Test
	public void existsById() {
		System.out.println(repository.existsById(1));
	}

	@Test
	public void findByIdIn(){
		Iterable<Product> products = repository.findByIdIn(Arrays.asList(1,2,3,4,5));
		products.forEach(p -> System.out.println(p));
	}
	
	@Test
	public void findByIdAndPrice() {
		Iterable<Product> products  = repository.findByNameAndPrice("iWatch", 300d);
		products.forEach(p -> System.out.println(p));
	}	
	
}
