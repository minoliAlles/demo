package com.tdd.sample.demo;

public class Cd {

    private int initialCdCount;

    public Cd(int count) {
        this.initialCdCount = count;
    }

    public int getCdCount() {
        return initialCdCount;
    }

    public void buyCopy(int boughtCount) throws InsufficientStockException{
        if(initialCdCount < boughtCount)
            throw new InsufficientStockException();
        initialCdCount -= boughtCount;
    }

}
