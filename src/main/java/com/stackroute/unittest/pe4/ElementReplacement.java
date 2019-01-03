package com.stackroute.unittest.pe4;

import java.util.Scanner;

public class ElementReplacement {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input the String : ");
        String str = in.nextLine();
        System.out.println("String after replacement is : "+replaceChars(str));
    }
    public static String replaceChars(String str){
        String res = str.replaceAll("d","f").replaceAll("l","t");
        return res;
    }
}
