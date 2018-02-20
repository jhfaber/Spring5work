package com.spring.Spring5work.repositories;

import org.springframework.data.repository.CrudRepository;

import com.spring.Spring5work.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
