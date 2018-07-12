package com.sushma.JPA2.JPAOneToMany;

import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.sushma.JPA2.JPAOneToMany.entities.Person;
import com.sushma.JPA2.JPAOneToMany.entities.Phone;
import com.sushma.JPA2.JPAOneToMany.repos.PersonRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaOneToManyApplicationTests {

	@Autowired
	private PersonRepository personRepository;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void savePerson() {
		Phone phone1 = new Phone();
		phone1.setPhoneNum("1234567890");
		phone1.setPhoneType("cell");
		
		Phone phone2 = new Phone();
		phone2.setPhoneNum("0987654321");
		phone2.setPhoneType("home");
		
		Person person = new Person();
		person.setName("Sushma");
		person.addPhoneNum(phone1);
		person.addPhoneNum(phone2);
		
		personRepository.save(person);
	}
	
	@Test
	public void loadPersonById()  throws Exception{
		Optional<Person> personOpt= personRepository.findById(2);
		if(!personOpt.isPresent()) {
			throw new Exception();
		}
		Person person = personOpt.get();
		System.out.println(person);
	}
	
	@Test
	public void updatePerson()  throws Exception{
		Optional<Person> personOpt= personRepository.findById(2);
		if(!personOpt.isPresent()) {
			throw new Exception();
		}
		Person person = personOpt.get();
		person.setName("Kumar");
		
		personRepository.save(person);
		System.out.println(person);
	}
	
	@Test
	@Transactional
	@Rollback(false)
	public void deletePerson()  throws Exception{
		Optional<Person> personOpt= personRepository.findById(2);
		if(!personOpt.isPresent()) {
			throw new Exception();
		}
		Person person = personOpt.get();
		personRepository.delete(person);
	}
}
