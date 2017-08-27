package com.example.user.shoppingbasket;

/**
 * Created by user on 27/08/2017.
 */

public abstract class Stock {
    int price;

    public Stock(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }
}
