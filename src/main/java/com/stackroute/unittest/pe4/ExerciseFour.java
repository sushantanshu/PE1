package com.stackroute.unittest.pe4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExerciseFour {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input the String : ");
        String[] str = in.nextLine().split(" ");
        for(String s : str){
            System.out.print(transpose(s)+" ");
        }

    }
    public static String transpose(String s) {
        StringBuffer sb = new StringBuffer(s);
        return sb.reverse().toString();
    }
}
