package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String []args){
        System.out.println("Enter your number : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(checkPalindrome(s));
    }
    public static String checkPalindrome(String s){
        int l = s.length();
        for(int i=0;i<l/2;i++){
            if(s.charAt(i)!=s.charAt(l-1-i)){
                return (s+" is not a palindrome");
            }
        }
        return checkSum(s);
    }
    public static String checkSum(String s){
        int sum = 0;
        int num = 0;
        int l = s.length();
        for(int i=0;i<l;i++){
            num = Integer.parseInt(""+s.charAt(i));
            if(num%2==0)
                sum += num;
        }
        if(sum>=25)
            return (s + " is a palindrome and the sum of even numbers is greater than or equals 25");
        else
            return (s + " is a palindrome and the sum of even numbers is less than 25");

    }
}
