package com.example.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 27/08/2017.
 */

public class ShopTest {

    Shop basket;
    Bread bread;
    DvdPlayer dvdPlayer;

    @Before
    public void before(){
        bread = new Bread(9.50);
        dvdPlayer = new DvdPlayer(19.50);
        basket = new Shop();
    }

    @Test
    public void testAddToBasket(){
        basket.addToBasket(bread);
        assertEquals(1, basket.sizeOfBasket());
    }

    @Test
    public void testRemoveOneItemFromBasket(){
        basket.addToBasket(bread);
        basket.addToBasket(bread);
        basket.removeOneFromBasket(bread);
        assertEquals(1, basket.sizeOfBasket());
    }

    @Test
    public void testRemoveAllFromBasket(){
        basket.addToBasket(bread);
        basket.addToBasket(bread);
        basket.removeAllFromBasket();
        assertEquals(0, basket.sizeOfBasket());
    }

    @Test
    public void testTotalValueOfBasket(){
        basket.addToBasket(bread);
        basket.addToBasket(bread);
        assertEquals(19.0, basket.totalValueOfBasket());
    }

//    @Test
//    public void testBuyOneGetOneFree(){
//        basket.addToBasket(bread);
//        basket.addToBasket(bread);
//        basket.buyOneGetOneFree();
//        assertEquals(9.5, basket.totalValueOfBasket());
//    }

    @Test
    public void testTenPresentOff(){
        basket.addToBasket(dvdPlayer);
        basket.addToBasket(dvdPlayer);
        assertEquals(35.1, basket.totalValueOfBasket());
    }

    @Test
    public void noTenPresentOff(){
        basket.addToBasket(dvdPlayer);
        assertEquals(19.5, basket.totalValueOfBasket());
    }

    @Test
    public void testLoyaltyCard(){
        basket.addToBasket(bread);
        basket.addToBasket(bread);
        basket.loyaltyCard();
        assertEquals(18.62, basket.loyaltyCard());
    }
}
