package com.stackroute.unittest.pe2;

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String []args){
        System.out.println("Enter your input : ");
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(checkPalindrome(str)?"Input is a Palindrome":"Input is not a palindrome");
    }
    public static boolean checkPalindrome(String str){
        StringBuilder sb  = new StringBuilder(str);
        String revStr = new String(sb.reverse());
        return str.equals(revStr)?true:false;

    }
}
