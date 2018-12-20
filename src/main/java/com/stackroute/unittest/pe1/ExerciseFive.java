package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args){
        System.out.println("Enter the input : ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] splitted = str.split("\\s+");
        System.out.println("Sum of given numbers is : " + findSum(splitted));

    }
    public static int findSum(String[] splitted){
        int sum = 0;
        for(String a : splitted){
            if(a.matches("[0-9]+")) {
                sum += Integer.parseInt(a);
            }
        }
        return sum;
    }
}
