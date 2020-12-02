package com.View;

import com.Model.*;

import java.util.ArrayList;
import java.util.Currency;

public class Main {

    OrderSystem os = new OrderSystem();

    Customer c1 = new Customer("Jeddi", 5);
    Customer c2 = new Customer("Samantha", 2);
    Customer c3 = new Customer("Fedly", 4);
    Customer c4 = new Customer("Edenia", 2);
    Customer c5 = new Customer("Aneetta", 1);

    Menu m1 = new Menu("M1", "Baso Aci", 20000);
    Menu m2 = new Menu("M2", "Makaroni Keju", 5000);
    Menu m3 = new Menu("M3", "Salad Ngeunah", 35000);
    Menu m4 = new Menu("M4", "Gulali Jos", 10000);
    Menu m5 = new Menu("M5", "Pempek Rama", 25000);

    Details d1 = new Details(m1, 1);
    Details d2 = new Details(m2, 1);
    Details d3 = new Details(m3, 1);
    Details d4 = new Details(m4, 1);
    Details d5 = new Details(m5, 1);
    ArrayList<Details> listDetail = new ArrayList<>();
    Payment p1 = new CreditCard(95000, "CC1");

    Details d6 = new Details(m1, 2);
    Details d7 = new Details(m3, 1);
    Details d8 = new Details(m5, 4);
    ArrayList<Details> listDetail2 = new ArrayList<>();
    Payment v1 = new Voucher(175000, "V1");

    public Main() {

        System.out.println("Order Pertama\n");
        CustomerManager.getInstance().setCustomer(c1);
        Customer currentCustomer = CustomerManager.getInstance().getCustomer();
        listDetail.add(d1);
        listDetail.add(d2);
        listDetail.add(d3);
        listDetail.add(d4);
        listDetail.add(d5);
        Order or1 = new Order(currentCustomer, "OR1", listDetail, null, p1);
        os.AddNewOrder(or1);
        CustomerManager.getInstance().setCustomer(null);

        System.out.println("--------------------------------------");

        System.out.println("Order Kedua\n");
        CustomerManager.getInstance().setCustomer(c1);
        listDetail2.add(d6);
        listDetail2.add(d7);
        listDetail2.add(d8);
        Order or2 = new Order(currentCustomer, "OR2", listDetail2, null, v1);
        os.AddNewOrder(or2);
        CustomerManager.getInstance().setCustomer(null);

        System.out.println("--------------------------------------");

        System.out.println("\nCoba Print All Order");
        os.PrintAllOrderDetails();

    }

    public static void main(String[] args) {
        new Main();
    }
}
