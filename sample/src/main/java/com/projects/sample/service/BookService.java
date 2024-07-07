package com.projects.sample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projects.sample.model.Book;
import com.projects.sample.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookrepository;

    public List<Book> getAllBook(){
        return bookrepository.findAll();
    }
    
    public Optional<Book> getBookById(long id){
        return bookrepository.findById(id);
    }

    public Book createBook(Book book){
        return bookrepository.save(book);
    }

    public List<Book> createBooks(List<Book> books){
        return bookrepository.saveAll(books);
    }

    public Book updateBook(long id, Book book){
        Book oldBook  = bookrepository.findById(id)
                        .orElseThrow(() -> new RuntimeException("Unable to find book by id: "+id));
        
        oldBook.setTitle(book.getTitle());
        oldBook.setAuthor(book.getAuthor());
        oldBook.setIsbn(book.getIsbn());

        return bookrepository.save(oldBook);
    }

    public void deleteBook(long id){
        bookrepository.deleteById(id);
    }
    
}
