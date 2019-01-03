package com.stackroute.unittest.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayUpdationTest {

    private  ArrayUpdation updater;
    @Before
    public void setUp() throws Exception {
        updater = new ArrayUpdation();
    }

    @Test
    public void updateElement() {
        String[] array1 = new String[]{"Apple","Grape","Melon","Berry"};
        String[] array2 = new String[]{"Kiwi","Grape","Melon","Berry"};
        assertEquals(new ArrayList<String>(Arrays.asList(array2)),updater.updateElement(new ArrayList<String>(Arrays.asList(array1)),"Apple","Kiwi"));
    }

    @Test
    public void removeAllElements() {
        String[] array1 = new String[]{"Apple","Grape","Melon","Berry"};
        assertEquals(null,updater.removeAllElements(new ArrayList<String>(Arrays.asList(array1))));
    }
    @After
    public void tearDown() throws Exception {
        updater = null;
    }
}