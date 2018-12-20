package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class ExerciseSix {
    public static void main(String []args){
        System.out.println("Enter your character : ");
        Scanner in = new Scanner(System.in);
        char c =in.next().charAt(0);
        System.out.println(checkChar(c));
    }
    public static String checkChar(char c){
        if(c>='a'&&c<='z'){
            return (c+" is a small case letter");
        }
        else if(c>='A'&&c<='Z'){
            return (c+" is a capital case letter");
        }
        else if(c>='1'&&c<='9'){
            return (c+" is a digit");
        }
        else{
            return (c+" is a special character");
        }
    }
}
