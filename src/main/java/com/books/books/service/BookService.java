package com.books.books.service;

import com.books.books.Book;
import com.books.books.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
//    @Autowired
   private final BookDao bookDao;

    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }
    public List<Book> getAllBooks() {
    return bookDao.findAll();
  }
}
