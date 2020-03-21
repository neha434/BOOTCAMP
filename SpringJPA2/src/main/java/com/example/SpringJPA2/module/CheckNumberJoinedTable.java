package com.example.SpringJPA2.module;

import javax.persistence.Entity;

@Entity
public class CheckNumberJoinedTable extends PaymentJoinedTable
{
    private String checkNumber;

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }
}