package com.stackroute.unittest.pe2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {
        private Member memOne;
        private MemberVariable memTwo;

        @Before
        public void setUp(){
            memOne = new Member("Sushant",22,50000);
            memTwo = new MemberVariable();
        }

        @Test
        public void memberTestOne(){

            assertEquals(memOne.toString(),memTwo.displayMembers("Sushant",22,50000).toString());
        }


}