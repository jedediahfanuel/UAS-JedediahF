package com.Model;

public class CreditCard extends Payment{

    private String ccNumber;

    public CreditCard(String orderID, int amount, String ccNumber) {
        super(orderID, amount);
        this.ccNumber = ccNumber;
    }
}
