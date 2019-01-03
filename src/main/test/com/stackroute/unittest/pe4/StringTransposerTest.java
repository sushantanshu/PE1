package com.stackroute.unittest.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposerTest {

    private StringTransposer strTrans;

    @Before
    public void setUp() throws Exception {

        strTrans = new StringTransposer();
    }

    @Test
    public void transpose() {
        assertEquals("tnahsus",strTrans.transpose("sushant"));
        assertEquals("uhsna",strTrans.transpose("anshu"));
        assertEquals("htrahddis",strTrans.transpose("siddharth"));
        assertEquals("lahgnis",strTrans.transpose("singhal"));
    }
    @After
    public void tearDown() throws Exception {
        strTrans = null;
    }
}