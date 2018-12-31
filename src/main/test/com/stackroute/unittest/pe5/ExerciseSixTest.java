package com.stackroute.unittest.pe5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class ExerciseSixTest {

    @Test
    public void sortSet() {
        ExerciseSix ex6 = new ExerciseSix();
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
        assertEquals(new TreeSet(resSet).toString(),ex6.sortSet(set).toString());
    }
}