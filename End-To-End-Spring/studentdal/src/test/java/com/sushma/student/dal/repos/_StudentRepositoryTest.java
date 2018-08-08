package com.sushma.student.dal.repos;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sushma.student.dal.entities.Student;
import com.sushma.student.dal.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class _StudentRepositoryTest {

	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void createStudent() {
		studentRepository.save(new Student("Sushma", "Spring MVC", 1200d));
	}

	@Test
	public void findAllStudents() {
		Iterable<Student> iterator = studentRepository.findAll();
		for (Student student : iterator) {
			System.out.println(student);
		}

	}

	@Test
	public void findStudentById() {
		Student student = null;
		Optional<Student> studentOpt = studentRepository.findById(1);

		if (studentOpt.isPresent()) {
			student = (Student) studentOpt.get();
		}
		System.out.println("Student:" + student);
	}

	@Test
	public void updateStudent() {
		Student student = null;
		Optional<Student> studentOpt = studentRepository.findById(2);

		if (studentOpt.isPresent()) {
			student = (Student) studentOpt.get();
			System.out.println("Student:" + student);
			student.setName("Kiran");
			studentRepository.save(student);
		}

	}

	@Test
	public void deleteStudent() {
		Student student = new Student();
		student.setId(3);
		studentRepository.deleteById(3);
	}

}
