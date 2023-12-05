package com.tdd.sample.demo;

import java.util.List;

public class ShoppingCart {

    private final List<Item> itemList;

    public ShoppingCart(List<Item> list) {
        this.itemList = list;
    }

    public double getTotal() {
        
        if(itemList.isEmpty())
            return 0.0;

       
        return itemList.stream().mapToDouble(item -> item.getUnitPrice()*item.getQuantity()).sum();
        
    }

}
