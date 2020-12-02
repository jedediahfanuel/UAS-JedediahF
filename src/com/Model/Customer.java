package com.Model;

public class Customer {

    private String name;
    private int numOfPeople;

    public Customer(String name, int numOfPeople) {
        this.name = name;
        this.numOfPeople = numOfPeople;
    }

    @Override
    public String toString() {
        String strBuild = "";
        strBuild += "Name = " + name + "\n";
        strBuild += "NumOfPeople = " + numOfPeople + "\n";

        return strBuild;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfPeople() {
        return numOfPeople;
    }

    public void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }
}
