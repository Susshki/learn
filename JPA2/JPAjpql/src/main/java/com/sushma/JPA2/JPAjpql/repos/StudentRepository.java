package com.sushma.JPA2.JPAjpql.repos;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sushma.JPA2.JPAjpql.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

	@Query("from Student")
	public List<Student> selectAllData();
	
	@Query("select firstName, lastName from Student")
	public List<Object[]> selectPartialData();
	
	@Modifying
	@Query("update Student set email=:emailAddr where id=:id")
	public void updateStudentEmail(@Param("emailAddr") String email, @Param("id") int id);

	@Modifying
	@Query("delete from Student where id=:id")
	public void deleteStudentById(@Param("id") int id);
	
	@Query("from Student where score<:score1 and score>:score2")
	public List<Student> studentsInScoreRange(int score1, int score2);
	
	@Query("from Student where id IN :ids")
	public List<Student> getStudentsByIds(@Param("ids") List<Integer> ids, Pageable p);
	
	@Query(value="select * from student where last_name=:lastName", nativeQuery=true)
	public List<Student> getStudentByLastName(@Param("lastName") String lastName);
	
}
