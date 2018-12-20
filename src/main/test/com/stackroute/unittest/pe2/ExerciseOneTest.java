package com.stackroute.unittest.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseOneTest {

    @Test
    public void checkPalindrome() {
        ExerciseOne ex1 = new ExerciseOne();
        assertEquals(true,ex1.checkPalindrome("abcdedcba"));
        assertEquals(false,ex1.checkPalindrome("abdcba"));
        assertEquals(true,ex1.checkPalindrome("1234321"));
        assertEquals(false,ex1.checkPalindrome("12345"));
        assertEquals(true,ex1.checkPalindrome("@$%$@"));
        assertEquals(false,ex1.checkPalindrome("@#$%^&*"));

    }

}