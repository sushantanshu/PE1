package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class ExerciseEight {
    public static void main(String[] args){
        int target = 23;
        int num = 0;
        while(target!=num){
            System.out.println("Enter your guess between 1 and 100: ");
            Scanner in = new Scanner(System.in);
            num = in.nextInt();
            if(num>target)
                System.out.println("Number guessed is more than original.Try again :");
            else if(num<target)
                System.out.println("Number guessed is less than original.Try again :");
            else
                System.out.println("Number guessed matches the original!");
        }
    }
}
