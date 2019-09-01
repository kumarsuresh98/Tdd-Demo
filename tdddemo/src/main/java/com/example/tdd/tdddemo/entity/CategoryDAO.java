package com.example.tdd.tdddemo.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDAO extends JpaRepository<BookCategory,Long> {

}