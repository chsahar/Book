package com.books.books.service;

import com.books.books.Book;
import com.books.books.dao.BookDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
//    @Autowired
    private final BookDao bookDao;

    private static final Logger logger = LoggerFactory.getLogger(BookService.class);

    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public ResponseEntity <List<Book> >getAllBooks() {
        try {
            return  new ResponseEntity<>(bookDao.findAll(), HttpStatus.OK);
            } catch (Exception e) {
            logger.error("Error fetching books", e);
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);}
    }

  public ResponseEntity<List<Book>> getBookByGenre(String genre) {
        try{
            return new ResponseEntity<>(bookDao.findByGenre(genre), HttpStatus.OK);

        } catch (Exception e) {
            logger.error("Error fetching genre", e);
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
  }
}
