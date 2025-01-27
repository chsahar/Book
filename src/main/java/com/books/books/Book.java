package com.books.books;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "bookss")
public class Book {

@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String book;
    private String authors;
    private String original_language;
    private String first_published;
    private Double approximate_sales_millions;
    private String genre;
}
