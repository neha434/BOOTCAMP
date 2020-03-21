package com.example.SpringJPA2.controller;

import com.example.SpringJPA2.module.CheckNumberTablePerClass;
import com.example.SpringJPA2.module.CreditCardTablePerClass;
import com.example.SpringJPA2.repos.TablePerClassInheritanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// 3. Implement and demonstrate Table Per Class strategy.
@RestController
public class TablePerClassController
{
    @Autowired
    TablePerClassInheritanceRepository repository;
    @GetMapping("/tablePerClassInheritance")
    void setData()
    {
        CheckNumberTablePerClass checkNumberTablePerClass=new CheckNumberTablePerClass();
        checkNumberTablePerClass.setId(101);
        checkNumberTablePerClass.setAmount(20000);
        checkNumberTablePerClass.setCheckNumber("12324456");

        CreditCardTablePerClass creditCardTablePerClass=new CreditCardTablePerClass();
        creditCardTablePerClass.setId(102);
        creditCardTablePerClass.setAmount(43555);
        creditCardTablePerClass.setCardNumber("98747890");
        repository.save(checkNumberTablePerClass);
        repository.save(creditCardTablePerClass);

    }
}
