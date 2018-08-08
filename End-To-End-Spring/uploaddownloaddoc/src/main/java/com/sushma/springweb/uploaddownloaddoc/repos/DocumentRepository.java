package com.sushma.springweb.uploaddownloaddoc.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sushma.springweb.uploaddownloaddoc.entities.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {

}
