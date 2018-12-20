package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseNineTest {

    @Test
    public void reverseString() {
        ExerciseNine ex9 = new ExerciseNine();
        assertEquals("abcde",ex9.reverseString("edcba"));
    }
}