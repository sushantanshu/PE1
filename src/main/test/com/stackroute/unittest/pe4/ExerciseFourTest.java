package com.stackroute.unittest.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseFourTest {

    @Test
    public void transpose() {
        ExerciseFour ex4 = new ExerciseFour();
        assertEquals("tnahsus",ex4.transpose("sushant"));
        assertEquals("uhsna",ex4.transpose("anshu"));
        assertEquals("htrahddis",ex4.transpose("siddharth"));
        assertEquals("lahgnis",ex4.transpose("singhal"));
    }
}