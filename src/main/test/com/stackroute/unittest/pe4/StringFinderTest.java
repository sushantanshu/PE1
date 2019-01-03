package com.stackroute.unittest.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringFinderTest {

    private StringFinder strFind;

    @Before
    public void setUp() throws Exception {
        strFind = new StringFinder();
    }

    @Test
    public void findMatch() {
        assertEquals("Found at : 4-6\nFound at : 10-12\nFound at : 27-29\n",strFind.findMatch("se","She sells seashells by the seashore"));
    }

    @After
    public void tearDown() throws Exception {
        strFind = null;
    }
}