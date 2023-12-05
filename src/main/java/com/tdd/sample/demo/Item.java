package com.tdd.sample.demo;

public class Item {
    private final double uPrice;
    private final int quantity;

    public Item(double price, int quantity) {
        this.uPrice = price;
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return this.uPrice;   }

    public double getQuantity() {
        return this.quantity;
    }

}
