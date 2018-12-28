package com.stackroute.unittest.pe3;

public class ChessBoard {
    public static void main(String[] args){
        final int len = 8;
        System.out.println(createChessBoard(len));
    }

    public static String createChessBoard(int len){
        String res ="";
            for(int i=0;i<len;i++){
                for(int j=0;j<len;j++){
                    if((i+j)%2==0){
                        res += ("WW|");
                    }
                    else{
                        res+=("BB|");
                    }
                }
                res +="\n";
            }
            return res;
    }
}
