package com.stackroute.unittest.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StringKeyValueTest {

    private StringKeyValue strKeyValue;

    @Before
    public void setUp() throws Exception {
        strKeyValue = new StringKeyValue();
    }

    @Test
    public void appearsMultipleTimes() {
        String[] str = {"a","b","c","d","a","c","c"};
        Map<String,Integer> map = new HashMap<>();
        map.put("a",2);
        map.put("b",1);
        map.put("c",3);
        map.put("d",1);
        assertEquals(map,strKeyValue.appearsMultipleTimes(str));
    }

    @After
    public void tearDown() throws Exception {
        strKeyValue = null;
    }
}