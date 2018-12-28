package com.stackroute.unittest.pe4;

import com.stackroute.unittest.pe1.ExerciseTen;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ExerciseThreeTest {

    @Test
    public void sort() {
        ExerciseThree ex3 = new ExerciseThree();
        Assert.assertArrayEquals(new String[]{"anshu","siddharth","singhal","sushant"},ex3.sort(new String[]{"anshu","sushant","siddharth","singhal"}));
        Assert.assertArrayEquals(new String[]{"ramya","sri","srinivas","tejaswini"},ex3.sort(new String[]{"srinivas","tejaswini","ramya","sri"}));

    }
}