package com.example.tdd.tdddemo.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface BookDAO extends JpaRepository<Book,Long> {

}