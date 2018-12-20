package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class ExerciseTen {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner in1 = new Scanner(System.in);
        int num = in1.nextInt();

        System.out.println("Enter the string : ");
        Scanner in2 = new Scanner(System.in);
        String st = in2.next();

        System.out.println("Output is : "+ printPattern(num,st));
    }
    public static String printPattern(int num,String st){

        String res = st;
        for(int i=1;i<num;i++){
            res+=st.substring(st.length()-num);
        }
        return res;

    }
}
