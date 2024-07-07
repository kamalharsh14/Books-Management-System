package com.projects.bms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.bms.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

    
}
