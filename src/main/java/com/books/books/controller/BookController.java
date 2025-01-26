package com.books.books.controller;

import com.books.books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("book")
public class BookController {

@Autowired
BookService bookService;
    @GetMapping("aBook")

    public String GetBook(){
    return bookService.GetBook();
    }
}
