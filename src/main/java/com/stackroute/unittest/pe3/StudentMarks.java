package com.stackroute.unittest.pe3;

import java.util.Scanner;

public class StudentMarks {
    private int numOfStudents;
    private int[] stuGrades;
    public void getNumOfStudents(int num){
        this.numOfStudents=num;
    }
    public void getStuGrades(int[] grades){
        this.stuGrades =grades;
    }
}
class StudentManager{
    public static  void  main(String[] args)throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of Students : ");
        int num = in.nextInt();
        int[] grades = new int[num];
        for(int i=0;i<num;i++){
            System.out.println("Enter grade of Student "+(i+1)+" : ");
            grades[i] = in.nextInt();
            if(grades[i]<0||grades[i]>100){
                throw new Exception("Grade must be between 0 and 100.");
            }
        }
        StudentMarks sm = new StudentMarks();
        sm.getNumOfStudents(num);
        sm.getStuGrades(grades);
    }
}
