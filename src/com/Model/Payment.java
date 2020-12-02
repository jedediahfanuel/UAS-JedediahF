package com.Model;

abstract public class Payment {

    private int amount;

    public Payment(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Amount = " + amount + "\n";
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
