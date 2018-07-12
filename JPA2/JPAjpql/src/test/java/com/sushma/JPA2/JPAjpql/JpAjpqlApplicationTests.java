package com.sushma.JPA2.JPAjpql;

import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.sushma.JPA2.JPAjpql.entities.Student;
import com.sushma.JPA2.JPAjpql.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpAjpqlApplicationTests {

	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void saveStudents() {
		Student student1 = new Student("Sushma", "Uppuluri", "sushma@gmail.com", 98);
		studentRepository.save(student1);
		
		Student student2 = new Student("Kiran", "Par", "kiran@gmail.com", 99);
		studentRepository.save(student2);
		
		Student student3 = new Student("Swamy", "Uppuluri", "swamy@gmail.com", 100);
		studentRepository.save(student3);
		
		studentRepository.findAll().forEach(p -> System.out.println(p));
	}

	@Test
	public void getAlldata() {
		List<Student> students= studentRepository.selectAllData();
		students.forEach(p -> System.out.println(p));
	}
	
	@Test
	public void getPartialdata() {
		List<Object[]> students= studentRepository.selectPartialData();
		for (Object[] objects : students) {
			System.out.println("first Name:"+objects[0]+" LastName:"+objects[1]);
		}
	}
	
	@Test
	public void getStudentInScoreRange() {
		List<Student> products = studentRepository.studentsInScoreRange(80, 100);
		products.forEach(p -> System.out.println(p));
	}

	
	@Test
	@Transactional
	@Rollback(false)
	public void updateStudentEmail() {
		studentRepository.updateStudentEmail("Sushki@gmail.com", 1);		
		System.out.println(studentRepository.findById(1));
	}
	
	
	@Test
	@Transactional
	@Rollback(false)
	public void deleteStudentById() {
		studentRepository.deleteStudentById(1);
	}
	
	@Test
	public void getStudentsInIds() {
		List<Student> students = studentRepository.getStudentsByIds(Arrays.asList(2,4,6,10), new PageRequest(1, 3, Direction.DESC, "id"));
		students.forEach(p -> System.out.println(p));
	}
	
	@Test
	public void getStudentByLastName() {
		List<Student> students = studentRepository.getStudentByLastName("UPPU");
		students.forEach(p -> System.out.println(p));
	}
}
