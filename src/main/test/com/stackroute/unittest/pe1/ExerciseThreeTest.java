package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseThreeTest {

    @Test
    public void isAlphabetic() {
        ExerciseThree ex3 = new ExerciseThree();
        assertEquals('1' + " is not an alphabet",ex3.isAlphabetic('1'));
        assertEquals('a' + " is vowel",ex3.isAlphabetic('a'));
        assertEquals('z' + " is consonant",ex3.isAlphabetic('z'));
    }

    @Test
    public void isVowel() {
        ExerciseThree ex3 = new ExerciseThree();
        assertEquals('a' + " is vowel",ex3.isVowel('a'));
        assertEquals('z' + " is consonant",ex3.isVowel('z'));
    }
}