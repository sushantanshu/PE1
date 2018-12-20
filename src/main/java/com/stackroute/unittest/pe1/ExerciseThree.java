package com.stackroute.unittest.pe1;
import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args){
        System.out.println("Enter your word : ");
        Scanner in = new Scanner(System.in);
        String st = in.next();

        for(int i=0;i<st.length();i++){
            System.out.println(isAlphabetic(st.charAt(i)));
        }
    }
    public static String isAlphabetic(char c) {
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            return(isVowel(c));
        else
            return((char)c + " is not an alphabet");
    }
    public static String isVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            return (ch + " is vowel");
        else
            return (ch + " is consonant");

    }
}
