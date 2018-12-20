package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseFourTest {

    @Test
    public void printpattern() {
        ExerciseFour ex4 = new ExerciseFour();
        assertEquals("1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ",ex4.printpattern(5));
    }
}