package com.stackroute.unittest.pe4;

import java.util.Scanner;

public class NumberOfOccurance {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input the String : ");
        String str = in.nextLine();
        System.out.println("Input the Character : ");
        String c = in.next();
        System.out.println("Number of occurrences of "+c+" is "+countCharOccurance(str,c));


    }
    public static int countCharOccurance(String str,String c){
        int count = str.length()- str.replace( c, "").length();
        return count;
    }
}
