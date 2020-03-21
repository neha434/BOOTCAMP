package com.example.SpringJPA2.repos;

import com.example.SpringJPA2.module.EmployeeEmbedded;
import org.springframework.data.repository.CrudRepository;

public interface EmbeddedRepository extends CrudRepository<EmployeeEmbedded,Integer> {
}
