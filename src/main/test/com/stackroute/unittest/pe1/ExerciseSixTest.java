package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseSixTest {

    @Test
    public void checkChar() {
        ExerciseSix ex6 = new ExerciseSix();
        assertEquals('c'+" is a small case letter",ex6.checkChar('c'));
        assertEquals('A'+" is a capital case letter",ex6.checkChar('A'));
        assertEquals('1'+" is a digit",ex6.checkChar('1'));
        assertEquals('@'+" is a special character",ex6.checkChar('@'));
    }
}