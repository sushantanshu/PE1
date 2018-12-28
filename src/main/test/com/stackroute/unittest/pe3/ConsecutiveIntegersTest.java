package com.stackroute.unittest.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveIntegersTest {

    @Test
    public void isConsecutive() {
        ConsecutiveIntegers ci = new ConsecutiveIntegers();
        assertEquals(" Consecutive Numbers",ci.isConsecutive(new String[]{"11","12","13","14"}));
        assertEquals(" Non consecutive Numbers",ci.isConsecutive(new String[]{"21","12","13","14"}));
        assertEquals(" Consecutive Numbers",ci.isConsecutive(new String[]{"111","112","113","114"}));
        assertEquals(" Non consecutive Numbers",ci.isConsecutive(new String[]{"21","121","113","141"}));
    }
}