package com.stackroute.unittest.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfOccuranceTest {

    private NumberOfOccurance num;

    @Before
    public void setUp() throws Exception {
        num = new NumberOfOccurance();
    }

    @Test
    public void countCharOccurance() {
        assertEquals(2,num.countCharOccurance("sushantanshu","a"));
        assertEquals(2,num.countCharOccurance("tejaswini","i"));
        assertEquals(2,num.countCharOccurance("sriramya","r"));
        assertEquals(2,num.countCharOccurance("siddarthsinghal","s"));
    }
    @After
    public void tearDown() throws Exception {
        num = null;
    }
}