package com.example.SpringJPA3.repo;

import com.example.SpringJPA3.entities.onetomanyuni.AuthorUni;
import org.springframework.data.repository.CrudRepository;

public interface Authorunirepo extends CrudRepository<AuthorUni,Long> {
}