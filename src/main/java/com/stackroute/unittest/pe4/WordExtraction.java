package com.stackroute.unittest.pe4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WordExtraction {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input the String : ");
        String str = in.nextLine();

        String[] strArr = str.split("\\s+|\\n");
        String[] sorted = sort(strArr);
        for(String s : sorted){
            System.out.println(s+" ");
        }

    }
    public static String[] sort(String[] s) {
        Arrays.sort(s);
        return s;
    }
}
