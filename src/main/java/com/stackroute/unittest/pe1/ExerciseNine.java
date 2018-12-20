package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class ExerciseNine {
    public static void main(String []args){
        System.out.println("Enter your String : ");
        Scanner in = new Scanner(System.in);
        String st = in.next();
        System.out.println("The given String in reverse is : "+reverseString(st));
    }
    public static String reverseString(String str){

        String rev = "";
        for(int i=0;i<str.length();i++){
            rev= rev + str.charAt(str.length()-1-i);
        }
        return rev;

    }
}
