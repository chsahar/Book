package com.books.books;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Book {

@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String title;
    private String authors;
    private String language;
    private String year;
    private Double sales;
    private String genre;
}
