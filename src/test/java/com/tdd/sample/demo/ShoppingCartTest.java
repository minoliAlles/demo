package com.tdd.sample.demo;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.Test;

public class ShoppingCartTest {
    
    @Test
    public void totalEmptyCart(){
        ShoppingCart cart = new ShoppingCart(new ArrayList<>());
        assertEquals(0.0, cart.getTotal(), 0.0);
    }

    @Test
    public void getOneItemoCartTotal(){
        ShoppingCart cart = new ShoppingCart(List.of(new Item(50.0,2)));
        assertEquals(100.0, cart.getTotal(), 0.0);
    }

    @Test
    public void getMultipleItemoCartTotal(){
        ShoppingCart cart = new ShoppingCart(List.of(new Item(50.0,2),new Item(100, 5)));
        assertEquals(600.0, cart.getTotal(), 0.0);
    }
    
}
