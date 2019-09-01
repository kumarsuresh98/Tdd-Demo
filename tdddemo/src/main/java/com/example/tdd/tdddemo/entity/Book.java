package com.example.tdd.tdddemo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jdk.nashorn.internal.objects.annotations.Property;

import javax.persistence.*;
import java.util.List;


@Entity
public class Book{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;
     @Property
    private String name;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "book_category_id")
    private BookCategory bookCategory;

    @JsonManagedReference
    @OneToMany(mappedBy = "book",cascade = CascadeType.ALL)
    private List<Page> pages;

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

    public Book() {

    }

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, BookCategory bookCategory) {
        this.name = name;
        this.bookCategory = bookCategory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }

    @PrePersist
    private void prePersist(){
        if(pages!=null && !pages.isEmpty())
        pages.forEach(page->page.setBook(this));
    }
}