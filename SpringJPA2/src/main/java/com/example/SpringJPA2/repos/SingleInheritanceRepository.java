package com.example.SpringJPA2.repos;

import com.example.SpringJPA2.module.PaymentSingleTable;
import org.springframework.data.repository.CrudRepository;

public interface SingleInheritanceRepository extends CrudRepository<PaymentSingleTable,Integer> {
}