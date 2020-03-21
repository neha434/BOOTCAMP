package com.example.SpringJPA2.repos;

import com.example.SpringJPA2.module.PaymentJoinedTable;
import org.springframework.data.repository.CrudRepository;

public interface JoinedInheritanceRepository extends CrudRepository<PaymentJoinedTable,Integer> {
}