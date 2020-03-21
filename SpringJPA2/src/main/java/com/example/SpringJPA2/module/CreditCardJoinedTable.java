package com.example.SpringJPA2.module;

import javax.persistence.Entity;

@Entity

public class CreditCardJoinedTable extends PaymentJoinedTable {
    private String cardNumber;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}