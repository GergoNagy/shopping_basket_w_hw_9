package com.example.user.shoppingbasket;
import java.util.ArrayList;

/**
 * Created by user on 27/08/2017.
 */

public class Shop {

    ArrayList<Sellable> basket;

    public Shop(){
        this.basket = new ArrayList<Sellable>();
    }

    public void addToBasket(Sellable sellable){
        this.basket.add(sellable);
    }

    public int sizeOfBasket() {
        return this.basket.size();
    }

    public void removeOneFromBasket(Sellable sellable){
        this.basket.remove(sellable);
    }

    public void removeAllFromBasket(){
        this.basket.clear();
    }

    public int totalValueOfBasket(){
        int total = 0;
        for (int i = 0; i < this.basket.size(); i++){
            total += this.basket.get(i).getPrice();
        }
        return total;
    }
    
    
}
