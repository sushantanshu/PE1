package com.stackroute.unittest.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElementReplacementTest {

    private ElementReplacement elRep;

    @Before
    public void setUp() throws Exception {
        elRep = new ElementReplacement();
    }

    @Test
    public void replaceChars() {
        assertEquals("faity fry",elRep.replaceChars("daily dry"));
        assertEquals("fethi farefevits",elRep.replaceChars("delhi daredevils"));
        assertEquals("patna pirates",elRep.replaceChars("patna pirates"));
        assertEquals("bengaturu butts",elRep.replaceChars("bengaluru bulls"));
    }
    @After
    public void tearDown() throws Exception {
        elRep = null;
    }
}