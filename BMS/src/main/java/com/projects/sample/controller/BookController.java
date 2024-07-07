package com.projects.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projects.sample.model.Book;
import com.projects.sample.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController {
    
    @Autowired
    private BookService bookService;

    @PostMapping
    public Book createBook(@RequestBody Book book){
        return bookService.createBook(book);
    }
    
    @PostMapping("/list")
    public ResponseEntity<List<Book>> createBooks(@RequestBody List<Book> books){
        List<Book> savedBooks = bookService.createBooks(books);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedBooks);
    }

    @GetMapping
    public List<Book> getAllBook(){
        return bookService.getAllBook();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable long id){
        return bookService.getBookById(id).map(ResponseEntity::ok)
                            .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> upadteBook(@PathVariable long id, @RequestBody Book book){
        Book upadteBook = bookService.updateBook(id, book);
        return ResponseEntity.ok(upadteBook);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable long id){
        bookService.deleteBook(id);
        return ResponseEntity.ok().build();
    }
}
