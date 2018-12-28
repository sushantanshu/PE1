package com.stackroute.unittest.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseOneTest {

    @Test
    public void countCharOccurance() {
        ExerciseOne ex1 = new ExerciseOne();
        assertEquals(2,ex1.countCharOccurance("sushantanshu","a"));
        assertEquals(2,ex1.countCharOccurance("tejaswini","i"));
        assertEquals(2,ex1.countCharOccurance("sriramya","r"));
        assertEquals(2,ex1.countCharOccurance("siddarthsinghal","s"));
    }
}