package com.Model;

import java.util.ArrayList;

public class OrderSystem {

    private ArrayList<Order> listOfOrder = new ArrayList<>();

    // ADD NEW ORDER
    public void AddNewOrder(Order order) {
        listOfOrder.add(order);
        System.out.println("Order added : " + order.getOrderID());
        order.setStatus(EnumStatus.INPUTTED);
        SendToKitchen(order);
    }

    // SEND TO KITCHEN
    public void SendToKitchen(Order order) {
        System.out.println("Order is sent to kitchen : " + order.getOrderID());
        order.setStatus(EnumStatus.QUEUEONKITCHEN);
        ProcessedByKitchen(order);
    }

    // PROCESSED BY KITCHEN
    public void ProcessedByKitchen(Order order) {
        System.out.println("Order is processed by kitchen : " + order.getOrderID());
        order.setStatus(EnumStatus.PROCESSED);
        OutForCustomer(order);
    }

    // OUT FOR CUSTOMER
    public void OutForCustomer(Order order) {
        System.out.println("Order is delivered to customer : " + order.getOrderID());
        order.setStatus(EnumStatus.OUTFORCUSTOMER);
        CalculateTotalPayment(order);
    }

    // CALCULATED TOTAL PAYMENT
    public void CalculateTotalPayment(Order order) {
        order.setStatus(EnumStatus.INVOICEREQUESTED);

        int biaya = 0;
        int jumlah = 0;
        int hargaMenu = 0;
        for (int i = 0; i < order.getListOfMenuDetail().size(); i++) {
            Details tempDetail = order.getListOfMenuDetail().get(i);
            Menu tempMenu = tempDetail.getMenuChoosen();
            jumlah = tempDetail.getQuantity();
            hargaMenu = tempMenu.getPrice();

            biaya += hargaMenu * jumlah;

        }

        order.getPayment().setAmount(biaya);
        System.out.println("Order is Calculated : " + biaya);

        Pay(order);
    }

    // PAY
    public void Pay(Order order) {
        if (order.getPayment() instanceof CreditCard) {
            System.out.println("Payment type : " + "Credit Card");
            System.out.println("CC Number : " + ((CreditCard) order.getPayment()).getCcNumber());
        } else if (order.getPayment() instanceof Voucher) {
            System.out.println("Payment type : " + "Voucher");
            System.out.println("Voucher Number : " + ((Voucher) order.getPayment()).getVoucherNumber());
        } else if (order.getPayment() instanceof EWallet) {
            System.out.println("Payment type : " + "EWallet");
            System.out.println("Cashback : " + ((EWallet) order.getPayment()).getCashback());
        }
        order.setStatus(EnumStatus.PAID);
    }

    // PRINT ALL ORDER DETAIL
    public void PrintAllOrderDetails() {
        String strBuild = "";
        for (int i = 0; i < listOfOrder.size(); i++) {
            strBuild += "List Of Order : \n" + listOfOrder.get(i).toString() + '\n';
        }
        System.out.println(strBuild);
    }

    public OrderSystem() {}

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
