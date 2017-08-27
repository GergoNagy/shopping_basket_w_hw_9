package com.example.user.shoppingbasket;
import java.util.ArrayList;

public class Shop {

    ArrayList<Sellable> basket;

    public Shop(){
        this.basket = new ArrayList<Sellable>();
    }

    public void addToBasket(Sellable sellable){
//        if (!basket.contains(sellable)) {
            this.basket.add(sellable);
//        }
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

    public final double totalValueOfBasket(){
        double total = 0;
        for (int i = 0; i < this.basket.size(); i++){
            total += this.basket.get(i).getPrice();
        }
        if  (total >= 20) {
            double value  =  total - (total * 0.1);
            return value;
        }
        else
            return total;
    }

    public double loyaltyCard(){
        double value = totalValueOfBasket();
        return value - (value * 0.02);
    }
    
    
}
