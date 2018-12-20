package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseSevenTest {

    @Test
    public void sortReverse() {
        ExerciseSeven ex7 = new ExerciseSeven();
        assertEquals("54321",ex7.sortReverse("12345"));
    }

    @Test
    public void sumEven() {
        ExerciseSeven ex7 = new ExerciseSeven();
        assertEquals(12,ex7.sumEven(new int[]{1,2,4,5,6,7}));
    }

    @Test
    public void checkSum() {
        ExerciseSeven ex7 = new ExerciseSeven();
        assertEquals(true,ex7.checkSum(16));
        assertEquals(false,ex7.checkSum(14));
    }
}