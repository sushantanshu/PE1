package com.stackroute.unittest.pe1;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseTwoTest {

    @Test
    public void tomJerry() {
        ExerciseTwo ex2 = new ExerciseTwo();
        assertEquals("Tom",ex2.tomJerry(21));
        assertEquals("Jerry",ex2.tomJerry(22));
    }
}