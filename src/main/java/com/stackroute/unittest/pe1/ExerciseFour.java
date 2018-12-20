package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args){
        System.out.println("Enter your number : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(printpattern(n));

    }
    public static String printpattern(int n){
        String str = "";
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                str +=(i+" ");
            }
        }
        return str;
    }
}
