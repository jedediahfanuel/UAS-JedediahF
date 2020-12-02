package com.Model;

public class Menu {

    private String idMenu;
    private String name;
    private int price;

    public Menu(String idMenu, String name, int price) {
        this.idMenu = idMenu;
        this.name = name;
        this.price = price;
    }

    public String getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(String idMenu) {
        this.idMenu = idMenu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
