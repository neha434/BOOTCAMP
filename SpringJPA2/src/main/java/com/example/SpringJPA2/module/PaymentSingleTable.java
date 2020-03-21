package com.example.SpringJPA2.module;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name ="pmode",discriminatorType = DiscriminatorType.STRING)//We have used String because we will be storing the values in the form of a String
public abstract class PaymentSingleTable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


}