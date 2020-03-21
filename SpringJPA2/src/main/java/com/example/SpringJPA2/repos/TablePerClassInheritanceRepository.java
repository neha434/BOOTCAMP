package com.example.SpringJPA2.repos;

import com.example.SpringJPA2.module.PaymentTablePerClass;
import org.springframework.data.repository.CrudRepository;

public interface TablePerClassInheritanceRepository extends CrudRepository<PaymentTablePerClass,Integer> {
}
