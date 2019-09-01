package com.example.tdd.tdddemo.controller;

import com.example.tdd.tdddemo.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("bookcategory")
public class BookController {
@Autowired
CategoryDAO categoryDAO;
@Autowired
    BookDAO bookDAO;
    @PostMapping
    @Transactional
    public BookCategory createBookCategory()throws Exception{
        List bookList=new ArrayList();
        BookCategory bookCategory=new BookCategory();
        bookCategory.setName("Category1");

        Book book1=new Book();
        book1.setName("book1");
        bookList.add(book1);

        Book book2=new Book();
        book2.setName("book2");
        bookList.add(book2);

        Book book3=new Book();
        book3.setName("book3");

        List<Page> pages=new ArrayList<>();
        Page page=new Page();
        page.setContent("blabla");
        pages.add(page);
        book3.setPages(pages);
        bookList.add(book3);
        bookCategory.setBooks(bookList);
        BookCategory bc= categoryDAO.save(bookCategory);

        return bc;
}

    @GetMapping("{id}")
    public BookCategory getBookCategory(@PathVariable final Long id) throws Exception{
        BookCategory b= categoryDAO.findById(id).get();
        b.getBooks();
        return b;
    }
    }
