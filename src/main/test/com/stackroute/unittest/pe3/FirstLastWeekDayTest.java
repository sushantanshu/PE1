package com.stackroute.unittest.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstLastWeekDayTest {

    String res = "Mon 24/12/2018\n" +
            "Sun 30/12/2018\n";
    @Test
    public void getFirstLastWeekDay() {
        FirstLastWeekDay flwd = new FirstLastWeekDay();
        assertEquals(res,flwd.getFirstLastWeekDay());
    }
}