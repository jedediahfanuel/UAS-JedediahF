package com.Model;

abstract public class Payment {

    private String orderID;
    private int amount;

    public Payment(String orderID, int amount) {
        this.orderID = orderID;
        this.amount = amount;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
