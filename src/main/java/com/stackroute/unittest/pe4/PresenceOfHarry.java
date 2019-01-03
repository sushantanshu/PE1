package com.stackroute.unittest.pe4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PresenceOfHarry {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input the String : ");
        String str = in.nextLine();
        System.out.println(isHarryHere(str));

    }
    public static String isHarryHere(String str){
        Pattern pattern = Pattern.compile("Harry");
        Matcher matcher = pattern.matcher(str);
        if(matcher.find()) {
            return ("Is Harry here ? "+true);
        }
        else{
            return ("Is Harry here ? "+false);
        }
    }
}
