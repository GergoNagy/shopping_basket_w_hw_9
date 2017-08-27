package com.example.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 27/08/2017.
 */

public class BreadTest {

    Bread bread;

    @Before
    public void before(){
        bread = new Bread(10);
    }

    @Test
    public void getPrice(){
        assertEquals(10, bread.getPrice());
    }
}
