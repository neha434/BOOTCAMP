package com.example.SpringJPA2.module;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CheckNumberTablePerClass")
public class CheckNumberTablePerClass extends PaymentTablePerClass
{
    private String checkNumber;

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }
}