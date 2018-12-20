package com.stackroute.unittest.pe1;
import java.util.Scanner;

public class ExerciseTwo{
    public static void main(String []args){
        System.out.println("Enter your number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(tomJerry(n));
    }
    public static String tomJerry(int n){
        if(n%2==0&&n>=20&&n<=30){
            return ("Jerry");
        }
        if(n%2!=0&&n>=20&&n<=30){
            return ("Tom");
        }
        return "Error!";
    }
}
