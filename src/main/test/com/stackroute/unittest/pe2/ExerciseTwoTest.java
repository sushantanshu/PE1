package com.stackroute.unittest.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseTwoTest {

    @Test
    public void checkPowerOfFour() {
        ExerciseTwo ex2 = new ExerciseTwo();
        assertEquals(true,ex2.checkPowerOfFour(16));
        assertEquals(false,ex2.checkPowerOfFour(15));
        assertEquals(false,ex2.checkPowerOfFour(17));
        assertEquals(true,ex2.checkPowerOfFour(64));
        assertEquals(true,ex2.checkPowerOfFour(1));
        assertEquals(true,ex2.checkPowerOfFour(256));
        assertEquals(false,ex2.checkPowerOfFour(255));
        assertEquals(false,ex2.checkPowerOfFour(0));
        assertEquals(true,ex2.checkPowerOfFour(1024));
        assertEquals(false,ex2.checkPowerOfFour(155));
    }
}