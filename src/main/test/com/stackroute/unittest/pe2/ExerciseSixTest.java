package com.stackroute.unittest.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseSixTest {

    @Test
    public void minimum() {
        ExerciseSix ex6 = new ExerciseSix();
        assertEquals(5,ex6.minimum(new int[]{5,13,55,76,86}));
        assertEquals(5,ex6.minimum(new int[]{5,108,16,76,86}));
        assertEquals(5,ex6.minimum(new int[]{5,13,16,76,86}));
        assertEquals(5,ex6.minimum(new int[]{5,13,16,706,86}));
    }

    @Test
    public void average() {
        ExerciseSix ex6 = new ExerciseSix();
        assertEquals(15,ex6.average(new int[]{5,10,15,20,25}));
        assertEquals(150,ex6.average(new int[]{50,100,150,200,250}));
        assertEquals(45,ex6.average(new int[]{5,25,45,65,85}));
        assertEquals(20,ex6.average(new int[]{-100,-50,100,50,100}));
    }

    @Test
    public void maximum() {
        ExerciseSix ex6 = new ExerciseSix();
        assertEquals(86,ex6.maximum(new int[]{5,13,16,76,86}));
        assertEquals(1116,ex6.maximum(new int[]{5,13,1116,76,86}));
        assertEquals(106,ex6.maximum(new int[]{5,13,106,76,86}));
        assertEquals(706,ex6.maximum(new int[]{5,13,16,706,86}));
    }
}