package com.Model;

public class Voucher extends Payment{

    private String voucherNumber;

    public Voucher(int amount, String voucherNumber) {
        super(amount);
        this.voucherNumber = voucherNumber;
    }

    @Override
    public String toString() {
        return "Amount = " + getAmount() + "\n" +
         "Voucher Number = " + voucherNumber + '\n';
    }

    public String getVoucherNumber() {
        return voucherNumber;
    }

    public void setVoucherNumber(String voucherNumber) {
        this.voucherNumber = voucherNumber;
    }
}
