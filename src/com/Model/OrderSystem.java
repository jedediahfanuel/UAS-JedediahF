package com.Model;

import java.util.ArrayList;

public class OrderSystem {

    private ArrayList<Order> listOfOrder = new ArrayList<>();

    public void AddNewOrder() {

    }

    public void SendToKitchen() {

    }

    public void ProcessedByKitchen() {

    }

    public void OutForCustomer() {

    }

    public int CalculateTotalPayment() {
        return 0;
    }

    public void Pay() {

    }

    public void PrintAllOrderDetails() {

    }

    public OrderSystem(ArrayList<Order> listOfOrder) {
        this.listOfOrder = listOfOrder;
    }

    public ArrayList<Order> getListOfOrder() {
        return listOfOrder;
    }

    public void setListOfOrder(ArrayList<Order> listOfOrder) {
        this.listOfOrder = listOfOrder;
    }
}
