package com.stackroute.unittest.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {

    String res = "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
            "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
            "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
            "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
            "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
            "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
            "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
            "BB|WW|BB|WW|BB|WW|BB|WW|\n" ;
    @Test
    public void createChessBoard() {
        ChessBoard chb = new ChessBoard();
        assertEquals(res,chb.createChessBoard(8));
    }
}