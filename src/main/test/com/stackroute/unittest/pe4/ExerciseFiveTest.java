package com.stackroute.unittest.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseFiveTest {

    @Test
    public void isHarryHere() {
        ExerciseFive ex5 = new ExerciseFive();
        assertEquals("Is Harry here ? "+true,ex5.isHarryHere("I am Harry"));
        assertEquals("Is Harry here ? "+true,ex5.isHarryHere("He is Harry"));
        assertEquals("Is Harry here ? "+false,ex5.isHarryHere("He is Sachin"));
        assertEquals("Is Harry here ? "+false,ex5.isHarryHere("He is Ricky"));
    }
}