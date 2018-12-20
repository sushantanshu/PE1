package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseOneTest {

    @Test
    public void main() {
    }

    @Test
    public void checkpalindrome() {
        ExerciseOne ex1 = new ExerciseOne();
        assertEquals("123" +" is not a palindrome", ex1.checkPalindrome("123"));
    }

    @Test
    public void checksum() {
        ExerciseOne ex1 = new ExerciseOne();
        assertEquals("2468642"+ " is a palindrome and the sum of even numbers is greater than or equals 25",ex1.checkSum("2468642"));
        assertEquals("12321"+ " is a palindrome and the sum of even numbers is less than 25",ex1.checkSum("12321"));
    }
}