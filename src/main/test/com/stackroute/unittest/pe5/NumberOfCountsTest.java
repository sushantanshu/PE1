package com.stackroute.unittest.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class NumberOfCountsTest {

    private NumberOfCounts count;

    @Before
    public void setUp() throws Exception {
        count = new NumberOfCounts();
    }

    @Test
    public void countString() {
        String  str = "one one -one___two,,three,one @three*one?two";
        Map<String,Integer> map = new HashMap<>();
        map.put("one",5);
        map.put("two",2);
        map.put("three",2);
        assertEquals(map,count.countString(str));

    }
    @After
    public void tearDown() throws Exception {
        count = null;
    }
}