package com.stackroute.unittest.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class ImplementationOfSetTest {

    private ImplementationOfSet ios;

    @Before
    public void setUp() throws Exception {
        ios = new ImplementationOfSet();
    }

    @Test
    public void sortSet() {
        HashSet<String> resSet = new HashSet<String>();
        resSet.add("Alice");
        resSet.add("Bluto");
        resSet.add("Eugene");
        resSet.add("Harry");
        resSet.add("Olive");
        HashSet<String> set = new HashSet<String>();
        set.add("Harry");
        set.add("Olive");
        set.add("Eugene");
        set.add("Alice");
        set.add("Bluto");
        assertEquals(new TreeSet(resSet).toString(),ios.sortSet(set).toString());
    }
    @After
    public void tearDown() throws Exception {
        ios = null;
    }
}