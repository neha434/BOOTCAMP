package com.example.SpringJPA3.repo;

import com.example.SpringJPA3.entities.onetomanybi.AuthorBi;
import org.springframework.data.repository.CrudRepository;

public interface AuthorBiRepo extends CrudRepository<AuthorBi,Long> {
}