package com.sushma.JPA2.JPAFiles.repos;

import org.springframework.data.repository.CrudRepository;

import com.sushma.JPA2.JPAFiles.entities.Image;

public interface ImageRepository extends CrudRepository<Image, Integer>{
	public Image findById(int id);
}
