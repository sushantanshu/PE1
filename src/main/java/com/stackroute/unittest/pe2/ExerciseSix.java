package com.stackroute.unittest.pe2;

import java.util.Scanner;

public class ExerciseSix {
    public static void main(String []args){
        System.out.println("Enter the number of students : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] grade = new int[num];
        for(int i=0;i<num;i++){
            System.out.println("Enter the grade of student "+(i+1)+" : ");
            grade[i] = in.nextInt();
            if(grade[i]<0||grade[i]>100)
                System.out.println("Wrong input.Enter again");
        }
            System.out.println("Minimum value is : " + minimum(grade));
            System.out.println("Average is : "+ average(grade));
            System.out.println("maximum value is: "+maximum(grade));
    }
    public static int minimum(int[] grade){
        int min = grade[0];
        for(int i=1;i<grade.length;i++){
            if(grade[i]<min)
                min = grade[i];
        }
        return min;

    }
    public static int average(int[] grade){
        int sum = grade[0];
        for(int i=1;i<grade.length;i++){
            sum+=grade[i];
        }
        return sum/grade.length;

    }
    public static int maximum(int[] grade){
        int max = grade[0];
        for(int i=1;i<grade.length;i++){
            if(grade[i]>max)
                max = grade[i];
        }
        return max;

    }
}
