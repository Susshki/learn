package com.sushma.student.dal.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sushma.student.dal.entities.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
