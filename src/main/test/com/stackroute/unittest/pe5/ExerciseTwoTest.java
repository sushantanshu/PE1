package com.stackroute.unittest.pe5;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ExerciseTwoTest {


    @Test
    public void countString() {
        ExerciseTwo ex2 = new ExerciseTwo();
        String  str = "one one -one___two,,three,one @three*one?two";
        Map<String,Integer> map = new HashMap<>();
        map.put("one",5);
        map.put("two",2);
        map.put("three",2);

        assertEquals(map,ex2.countString(str));

    }
}