package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseFiveTest {


    @Test
    public void findSum() {
        ExerciseFive ex5 = new ExerciseFive();
        assertEquals(39,ex5.findSum(new String[]{"12","13","14"}));
    }
}