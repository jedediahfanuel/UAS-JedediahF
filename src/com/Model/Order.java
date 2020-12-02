package com.Model;

import java.util.ArrayList;

public class Order {

    private Customer customer;
    private String orderID;
    private ArrayList<Details> listOfMenuDetail;
    private EnumStatus status;
    private Payment payment;

    public Order(Customer customer, String orderID, ArrayList<Details> listOfMenuDetail, EnumStatus status, Payment payment) {
        this.customer = customer;
        this.orderID = orderID;
        this.listOfMenuDetail = listOfMenuDetail;
        this.status = status;
        this.payment = payment;
    }

    @Override
    public String toString() {
        String strBuild = "";
        strBuild += customer.toString();
        strBuild += "OrderID = " + orderID + "\n";
        strBuild += "Status = " + status + "\n";
        strBuild += payment.toString() + "\n";
        strBuild += "Menu Detail : \n";
        for (int i = 0; i < listOfMenuDetail.size(); i++) {
            strBuild += listOfMenuDetail.get(i).toString();
        }
        return strBuild;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public ArrayList<Details> getListOfMenuDetail() {
        return listOfMenuDetail;
    }

    public void setListOfMenuDetail(ArrayList<Details> listOfMenuDetail) {
        this.listOfMenuDetail = listOfMenuDetail;
    }

    public EnumStatus getStatus() {
        return status;
    }

    public void setStatus(EnumStatus status) {
        this.status = status;
    }
}