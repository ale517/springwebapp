package com.alejandro.springwebapp.repository;

import com.alejandro.springwebapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository <Publisher,Long> {
}
