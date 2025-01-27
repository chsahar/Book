package com.books.books.controller;

import com.books.books.Book;
import com.books.books.dao.BookDao;
import com.books.books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {

@Autowired
BookService bookService;
    @Autowired
    private BookDao bookDao;

    @GetMapping("aBook")

    public ResponseEntity<List<Book>>getAllBooks(){ //returning all books
    return bookService.getAllBooks();
    }

    @GetMapping("genre/{genre}")
    public ResponseEntity<List<Book>> getBookByGenre(@PathVariable String genre){
        return bookService.getBookByGenre(genre);
    }
}
