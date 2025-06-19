package com.norastudio.server.model;


import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "isbn", unique = true)
    private String isbn;

    @Column(name = "description")
    private String description;

    @Column(name = "image")
    private String image;

    @Column(name = "price")
    private float price;

    @Column(name = "available_copies")
    private int availableCopies;

    public Book() {

    }

    public Book(String title, String author, String isbn, String description, String image, float price, int availableCopies) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.description = description;
        this.image = image;
        this.price = price;
        this.availableCopies = availableCopies;
    }
}
