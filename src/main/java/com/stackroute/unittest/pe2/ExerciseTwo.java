package com.stackroute.unittest.pe2;

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args){
        System.out.println("Enter your number : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(checkPowerOfFour(num)==true){
            System.out.println("Entered number is a power of four.");
        }
        else{
            System.out.println("Entered number is not a power of four.");
        }

    }
    public static boolean checkPowerOfFour(int num){
        int i=1;
        while(Math.pow(4,i)<=num){
            i++;
        }
        if(Math.pow(4,i-1)==num)
            return true;
        else
            return false;
    }
}
