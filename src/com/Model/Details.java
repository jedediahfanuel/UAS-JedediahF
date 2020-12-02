package com.Model;

public class Details {

    private Menu menuChoosen;
    private int quantity;

    public Details(Menu menuChoosen, int quantity) {
        this.menuChoosen = menuChoosen;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        String strBuild = "";
        strBuild += menuChoosen.toString() + "\n";
        strBuild += "Quantity = " + quantity + "\n\n";

        return strBuild;
    }

    public Menu getMenuChoosen() {
        return menuChoosen;
    }

    public void setMenuChoosen(Menu menuChoosen) {
        this.menuChoosen = menuChoosen;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
