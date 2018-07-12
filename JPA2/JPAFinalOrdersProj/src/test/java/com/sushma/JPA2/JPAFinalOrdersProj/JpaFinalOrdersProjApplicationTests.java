package com.sushma.JPA2.JPAFinalOrdersProj;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sushma.JPA2.JPAFinalOrdersProj.entities.Address;
import com.sushma.JPA2.JPAFinalOrdersProj.entities.Customer;
import com.sushma.JPA2.JPAFinalOrdersProj.entities.Order;
import com.sushma.JPA2.JPAFinalOrdersProj.entities.Product;
import com.sushma.JPA2.JPAFinalOrdersProj.repos.CustomerRepository;
import com.sushma.JPA2.JPAFinalOrdersProj.repos.OrderRepository;
import com.sushma.JPA2.JPAFinalOrdersProj.repos.ProductRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaFinalOrdersProjApplicationTests {

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Test
	public void addProduct() {
		Product product = new Product();
		product.setName("iPhone");
		product.setQuantityLeft(100);
		
		productRepository.save(product);	
	}
	
	@Test
	public void addCustomer() {
		
		Customer customer = new Customer();
		customer.setName("john");
		customer.setEmail("john@gmail.com");
		
		Address address = new Address();
		address.setAddressLine1("1 Unknow ln");
		address.setAddressLine2("");
		address.setCity("Alpha");
		address.setState("GA");
		address.setZipCode("30087");
		customer.setAddress(address);
		
		customerRepository.save(customer);			
	}
	
	@Test
	public void addOrder() {
		
		Order order = new Order();
		Customer customer = customerRepository.findById(1);
			
		order.setCustomer(customer);
		order.setDeliveryStatus("N");
		order.setId(1);
		order.setShippingDate(new Timestamp(new Date().getTime()));
		
		Product product = productRepository.findById(3);		
		order.setProducts(Arrays.asList(product));
		
		orderRepository.save(order);
	}
	
	


}
