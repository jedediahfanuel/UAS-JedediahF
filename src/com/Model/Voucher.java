package com.Model;

public class Voucher extends Payment{

    private String voucherNumber;

    public Voucher(String orderID, int amount, String voucherNumber) {
        super(orderID, amount);
        this.voucherNumber = voucherNumber;
    }
}
