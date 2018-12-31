package com.stackroute.unittest.pe5;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ExerciseOneTest {


    @Test
    public void updateElement() {
        ExerciseOne ex1 = new ExerciseOne();
        String[] array1 = new String[]{"Apple","Grape","Melon","Berry"};
        String[] array2 = new String[]{"Kiwi","Grape","Melon","Berry"};
        assertEquals(new ArrayList<String>(Arrays.asList(array2)),ex1.updateElement(new ArrayList<String>(Arrays.asList(array1)),"Apple","Kiwi"));
    }

    @Test
    public void removeAllElements() {
        ExerciseOne ex1 = new ExerciseOne();
        String[] array1 = new String[]{"Apple","Grape","Melon","Berry"};
        assertEquals(null,ex1.removeAllElements(new ArrayList<String>(Arrays.asList(array1))));
    }
}