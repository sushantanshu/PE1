package com.stackroute.unittest.pe4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordExtractionTest {

    private WordExtraction we;

    @Before
    public void setUp() throws Exception {
        we = new WordExtraction();
    }

    @Test
    public void sort() {
        Assert.assertArrayEquals(new String[]{"anshu","siddharth","singhal","sushant"},we.sort(new String[]{"anshu","sushant","siddharth","singhal"}));
        Assert.assertArrayEquals(new String[]{"ramya","sri","srinivas","tejaswini"},we.sort(new String[]{"srinivas","tejaswini","ramya","sri"}));

    }

    @After
    public void tearDown() throws Exception {
        we = null;
    }
}