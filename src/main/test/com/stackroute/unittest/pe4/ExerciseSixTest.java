package com.stackroute.unittest.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseSixTest {

    @Test
    public void findMatch() {
        ExerciseSix ex6 = new ExerciseSix();
        assertEquals("Found at : 4-6\nFound at : 10-12\nFound at : 27-29\n",ex6.findMatch("se","She sells seashells by the seashore"));
    }
}