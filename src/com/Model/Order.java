package com.Model;

import java.util.ArrayList;

public class Order {

    private Customer customer;
    private String orderID;
    private ArrayList<Details> listOfMenuDetail = new ArrayList<>();
    private EnumStatus status;

    public Order(Customer customer, String orderID, ArrayList<Details> listOfMenuDetail, EnumStatus status) {
        this.customer = customer;
        this.orderID = orderID;
        this.listOfMenuDetail = listOfMenuDetail;
        this.status = status;
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