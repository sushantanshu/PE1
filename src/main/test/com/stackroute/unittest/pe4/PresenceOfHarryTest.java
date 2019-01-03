package com.stackroute.unittest.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PresenceOfHarryTest {

    private PresenceOfHarry poh;

    @Before
    public void setUp() throws Exception {
        poh = new PresenceOfHarry();
    }

    @Test
    public void isHarryHere() {
        assertEquals("Is Harry here ? "+true,poh.isHarryHere("I am Harry"));
        assertEquals("Is Harry here ? "+true,poh.isHarryHere("He is Harry"));
        assertEquals("Is Harry here ? "+false,poh.isHarryHere("He is Sachin"));
        assertEquals("Is Harry here ? "+false,poh.isHarryHere("He is Ricky"));
    }
    @After
    public void tearDown() throws Exception {
        poh = null;
    }
}