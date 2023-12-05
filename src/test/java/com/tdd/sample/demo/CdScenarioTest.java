package com.tdd.sample.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CdScenarioTest {    

    //CD is in stock - stock count is reduced by quantity 
    @Test
    public void cdStock() throws InsufficientStockException{
        Cd cd = new Cd(10);
        cd.buyCopy(3);
        assertEquals(7, cd.getCdCount());
    }

    // Insufficient stock - throw an exception
    @Test(expected = InsufficientStockException.class)
    public void insufficientStocks() throws InsufficientStockException{
        new Cd(0).buyCopy(1);
    }
}
