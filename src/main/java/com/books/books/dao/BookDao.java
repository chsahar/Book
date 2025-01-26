package com.books.books.dao;

import com.books.books.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao extends JpaRepository<Book, Integer>{
 List<Book> findByGenre(String genre);
}
