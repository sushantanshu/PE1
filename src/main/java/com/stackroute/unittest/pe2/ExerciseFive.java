package com.stackroute.unittest.pe2;

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args){
        System.out.println("Enter your number : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(isEven(num)==true)
            System.out.println("Entered number is even");
        else
            System.out.println("Entered number is odd");

    }
    public static boolean isEven(int num){
        if(num%2==0)
            return true;
        return false;
    }
}
