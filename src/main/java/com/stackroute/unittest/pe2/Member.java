package com.stackroute.unittest.pe2;

import java.util.Scanner;

public class Member {
    String name;
    int age;
    double sal;
    public Member(String name,int age,double sal){
        this.name=name;
        this.age=age;
        this.sal=sal;
    }
    public String toString(){
        return ("Members Name: "+this.name+ "\nMembers age: " + this.age +"\nMembers salary: "+this.sal);
    }
}
class MemberVariable{
    public static void main(String[] args) {
        System.out.println("Enter member's name : ");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("Enter member's age : ");
        int age = in.nextInt();
        System.out.println("Enter member's salary : ");
        double sal = in.nextDouble();
        displayMembers(name,age,sal);
    }
    public static Object displayMembers(String name,int age,double sal){
        Member member = new Member(name,age,sal);
        return member;
    }
}
