package com.stackroute.unittest.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseTwoTest {

    @Test
    public void replaceChars() {
        ExerciseTwo ex2 = new ExerciseTwo();
        assertEquals("faity fry",ex2.replaceChars("daily dry"));
        assertEquals("fethi farefevits",ex2.replaceChars("delhi daredevils"));
        assertEquals("patna pirates",ex2.replaceChars("patna pirates"));
        assertEquals("bengaturu butts",ex2.replaceChars("bengaluru bulls"));
    }
}