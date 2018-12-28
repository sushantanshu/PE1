package com.stackroute.unittest.pe3;
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args){
        System.out.println(" Input number of columns of matrix");
        Scanner in = new Scanner(System.in);
        int columns = in.nextInt();
        System.out.println(" Input number of rows of matrix");
        int rows = in.nextInt();

        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];

        System.out.println(" Input elements of first matrix");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix1[i][j] = in.nextInt();
            }
        }
        System.out.println(" Input elements of second matrix");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix2[i][j] = in.nextInt();
            }
        }
        System.out.println(" The second matrix is : ");
        printMatrix(matrix2);

        MatrixAddition ma = new MatrixAddition();
        System.out.println(" The first matrix is : ");
        printMatrix(matrix1);


        System.out.println(" The sum of two matrix is : ");
        printMatrix(addMatrix(matrix1,matrix2));
    }

    public static int[][] addMatrix(int[][] matrix1,int[][] matrix2){
        int[][] matrixSum = new int[matrix1.length][matrix1[0].length];
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[0].length;j++){
                matrixSum[i][j] = matrix1[i][j]+matrix2[i][j];
            }
        }
        return matrixSum;
    }
    public static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
