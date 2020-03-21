package com.example.SpringJPA2.controller;

import com.example.SpringJPA2.module.CheckNumberJoinedTable;
import com.example.SpringJPA2.module.CreditCardJoinedTable;
import com.example.SpringJPA2.repos.JoinedInheritanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//2. Implement and demonstrate Joined strategy.
@RestController
public class JoinedInheritanceController {
    @Autowired
    JoinedInheritanceRepository repository;
    @GetMapping("/joinedTableInheritance")
    void setData()
    {
        CheckNumberJoinedTable checkNumberJoinedTable=new CheckNumberJoinedTable();
        checkNumberJoinedTable.setId(130);
        checkNumberJoinedTable.setAmount(12345);
        checkNumberJoinedTable.setCheckNumber("hdhdhd");
        CreditCardJoinedTable creditCardJoinedTable = new CreditCardJoinedTable();
        creditCardJoinedTable.setId(131);
        creditCardJoinedTable.setAmount(12367);
        creditCardJoinedTable.setCardNumber("1287387hh");
        repository.save(checkNumberJoinedTable);
        repository.save(creditCardJoinedTable);
    }
}
