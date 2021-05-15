package com.alejandro.springwebapp.repository;

import com.alejandro.springwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository <Author, Long> {

}
