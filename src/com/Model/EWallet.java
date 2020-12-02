package com.Model;

public class EWallet extends Payment{

    private int cashback;

    public EWallet(int amount, int cashback) {
        super(amount);
        this.cashback = cashback;
    }

    @Override
    public String toString() {
        return "Amount = " + getAmount() + "\n" +
                "Cashback = " + cashback + "\n";
    }

    public int getCashback() {
        return cashback;
    }

    public void setCashback(int cashback) {
        this.cashback = cashback;
    }
}
