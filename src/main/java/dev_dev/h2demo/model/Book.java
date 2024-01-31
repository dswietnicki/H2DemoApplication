package dev_dev.h2demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private int pages;

    public Book() {

    }
    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }
    @Override
    public String toString() {
        return "Book{" +
                "id= " + id +
                ", title= " + title +
                ", pages= " + pages + '\'' +
                '}';
    }

}
