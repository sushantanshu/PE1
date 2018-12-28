package com.stackroute.unittest.pe3;

import java.util.Scanner;

public class ConsecutiveIntegers {
    public static void main(String[] args){
        System.out.println("Input your integers seperated by comma : ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] ints = str.split(",");
        System.out.println(str+isConsecutive(ints));

    }
    public static String isConsecutive(String[] ints){
        int i;
        for(i=1;i<ints.length;i++){
            if(!(Integer.parseInt(ints[i])-Integer.parseInt(ints[i-1])==1)){
                return (" Non consecutive Numbers");
            }
        }if(i==ints.length)
            return (" Consecutive Numbers");
        return null;
    }
}
