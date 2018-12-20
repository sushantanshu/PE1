package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseTenTest {

    @Test
    public void printPattern() {
        ExerciseTen ex10 = new ExerciseTen();
        assertEquals("stackabab",ex10.printPattern(2,"stackab"));
    }
}