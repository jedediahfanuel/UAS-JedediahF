package com.Model;

public class CustomerManager {

    private static CustomerManager instance;
    private Customer customer;

    public CustomerManager() {
    }

    public static CustomerManager getInstance() {

        if (instance == null) {
            instance = new CustomerManager();
        }
        return instance;

    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
