package com.example.user.shoppingbasket;

/**
 * Created by user on 27/08/2017.
 */

public abstract class Stock {
    double price;

    public Stock(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }
}
