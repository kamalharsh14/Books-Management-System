package com.projects.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.sample.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

    
}
