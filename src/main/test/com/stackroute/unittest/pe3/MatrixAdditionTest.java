package com.stackroute.unittest.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {

    int[][] matrix1 ={{1,2},{3,4}};
    int[][] matrix2 ={{1,2},{3,4}};
    int[][] sum ={{2,4},{6,8}};
    @Test
    public void addMatrix() {
        MatrixAddition ma = new MatrixAddition();
        assertArrayEquals(sum,ma.addMatrix(matrix1,matrix2));
    }
}