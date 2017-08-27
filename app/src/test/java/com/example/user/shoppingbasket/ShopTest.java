package com.example.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 27/08/2017.
 */

public class ShopTest {

    Shop shop;
    Bread bread;
    DvdPlayer dvdPlayer;

    @Before
    public void before(){
        bread = new Bread(10);
        dvdPlayer = new DvdPlayer(19);
        shop = new Shop();
    }

    @Test
    public void testAddToBasket(){
        shop.addToBasket(bread);
        assertEquals(1, shop.sizeOfBasket());
    }

    @Test
    public void testRemoveOneItemFromBasket(){
        shop.addToBasket(bread);
        shop.addToBasket(bread);
        shop.removeOneFromBasket(bread);
        assertEquals(1, shop.sizeOfBasket());
    }

    @Test
    public void testRemoveAllFromBasket(){
        shop.addToBasket(bread);
        shop.addToBasket(bread);
        shop.removeAllFromBasket();
        assertEquals(0, shop.sizeOfBasket());
    }

    @Test
    public void testTotalValueOfBasket(){
        shop.addToBasket(bread);
        shop.addToBasket(bread);
        assertEquals(20, shop.totalValueOfBasket());
    }
}
