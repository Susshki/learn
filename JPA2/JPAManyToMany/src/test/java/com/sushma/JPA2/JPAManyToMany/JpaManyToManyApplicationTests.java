package com.sushma.JPA2.JPAManyToMany;

import java.util.HashSet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sushma.JPA2.JPAManyToMany.entities.Programmer;
import com.sushma.JPA2.JPAManyToMany.entities.Project;
import com.sushma.JPA2.JPAManyToMany.repos.ProgrammerRepository;
import com.sushma.JPA2.JPAManyToMany.repos.ProjectRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaManyToManyApplicationTests {

	@Autowired
	private ProgrammerRepository progRepo;
	
	@Autowired
	private ProjectRepository projRepo;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void saveProgrammer() {
		Programmer programmer = new Programmer();
		programmer.setName("Sushma");
		
		Project project = projRepo.findById(1);
		
		HashSet<Project> projects = new HashSet<Project>();
		projects.add(project);
		
		programmer.setProjects(projects);
		progRepo.save(programmer);
	}
	
}
