package com.stackroute.unittest.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOfPlacesTest {

    @Test
    public void removeVowels() {
        ArrayOfPlaces aop = new ArrayOfPlaces();
        assertArrayEquals(new String[]{"nd","pkstn","chn"},aop.removeVowels(new String[]{"india","pakistan","china"}));
        assertArrayEquals(new String[]{"sr lnk","jpn","npl"},aop.removeVowels(new String[]{"sri lanka","japan","nepal"}));
        assertArrayEquals(new String[]{"ntd stts","cnd","chn"},aop.removeVowels(new String[]{"united states","canada","china"}));
        assertArrayEquals(new String[]{"nd","bngldsh","fghnstn"},aop.removeVowels(new String[]{"india","bangladesh","afghanistan"}));

    }
}