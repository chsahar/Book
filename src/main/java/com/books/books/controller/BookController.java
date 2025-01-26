package com.books.books.controller;

import com.books.books.Book;
import com.books.books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {

@Autowired
BookService bookService;
    @GetMapping("aBook")

    public List<Book> getAllBooks(){ //returning all books
    return bookService.getAllBooks();
    }
}
