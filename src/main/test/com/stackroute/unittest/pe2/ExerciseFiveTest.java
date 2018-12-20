package com.stackroute.unittest.pe2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseFiveTest {

    @Test
    public void isEven() {
        ExerciseFive ex5 = new ExerciseFive();
        assertEquals(true,ex5.isEven(6));
        assertEquals(false,ex5.isEven(55));
        assertEquals(true,ex5.isEven(6));
        assertEquals(false,ex5.isEven(155));
    }

}