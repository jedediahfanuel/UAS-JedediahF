package com.Model;

public class CustomerManager {

    private static CustomerManager instance;
    private Customer cm;

    public static CustomerManager getInstance() {

        if (instance == null) {
            instance = new CustomerManager();
        }
        return instance;

    }

    public Customer getCustomer() {
        return cm;
    }

    public void setCustomer(Customer cm) {
        this.cm = cm;
    }

    private CustomerManager() {}
}
