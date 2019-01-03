package com.stackroute.unittest.pe4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringFinder {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input the String : ");
        String queryStr = in.nextLine();
        System.out.println("Input the string to be found : ");
        String query = in.next();
        System.out.print(findMatch(query,queryStr));


    }
    public static String findMatch(String query,String queryStr){
        Pattern pattern = Pattern.compile(query);
        Matcher matcher = pattern.matcher(queryStr);
        String res ="";
        while(matcher.find()) {
            res += ("Found at : "+matcher.start()+"-"+matcher.end()+"\n");
        }
        return res;
    }
}
