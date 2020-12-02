package com.Model;

public class CreditCard extends Payment{

    private String ccNumber;

    public CreditCard(int amount, String ccNumber) {
        super(amount);
        this.ccNumber = ccNumber;
    }

    @Override
    public String toString() {
        return "Amount = " + getAmount() + "\n" +
                "CC Number = " + ccNumber + '\n';
    }

    public String getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }
}
