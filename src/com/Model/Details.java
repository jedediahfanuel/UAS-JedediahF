package com.Model;

public class Details {

    private Menu menuChoosen;
    private int quantity;

    public Details(Menu menuChoosen, int quantity) {
        this.menuChoosen = menuChoosen;
        this.quantity = quantity;
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
