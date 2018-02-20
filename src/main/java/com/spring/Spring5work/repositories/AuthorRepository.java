package com.spring.Spring5work.repositories;

import org.springframework.data.repository.CrudRepository;

import com.spring.Spring5work.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
