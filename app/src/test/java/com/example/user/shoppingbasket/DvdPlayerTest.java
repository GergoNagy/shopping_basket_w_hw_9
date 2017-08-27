package com.example.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 27/08/2017.
 */

public class DvdPlayerTest {

    DvdPlayer dvdPlayer;

    @Before
    public void before(){
        dvdPlayer = new DvdPlayer(19);
    }

    @Test
    public void getPrice(){
        assertEquals(19, dvdPlayer.getPrice());
    }
}
