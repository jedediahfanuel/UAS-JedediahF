package com.Model;

public class EWallet extends Payment{

    private int cashback;

    public EWallet(String orderID, int amount, int cashback) {
        super(orderID, amount);
        this.cashback = cashback;
    }
}
