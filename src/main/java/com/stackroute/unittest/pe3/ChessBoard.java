package com.stackroute.unittest.pe3;

public class ChessBoard {
    public static void main(String[] args){
        final int len = 8;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if((i+j)%2==0){
                    System.out.print("WW|");
                }
                else{
                    System.out.print("BB|");
                }
            }
            System.out.println();
        }
    }
}
