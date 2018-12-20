package com.stackroute.unittest.pe1;

import java.util.Arrays;
import java.util.Scanner;
class ExerciseSeven {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println("Sorted number in non-increasing order : "+sortReverse(str));
        System.out.println("Sum of even numbers : "+sumEven(sorted));
        System.out.println(checkSum(sumEven(sorted)));
    }
    static int[] sorted;
    public static String sortReverse(String a) {
        sorted = new int[a.length()];
        for(int i=0;i<a.length();i++){
            sorted[i]=Integer.parseInt(""+a.charAt(i));
        }
        int sum = 0;
        int in = 0;
        String sortedStr="";
        Arrays.sort(sorted);
        for (int i = 0; i < sorted.length/2; i++) {
            int temp = sorted[i];
            sorted[i] = sorted[sorted.length - 1 - i];
            sorted[sorted.length - 1 - i] = temp;
        }
        for(int i: sorted){
            sortedStr += (""+i);
        }
        return sortedStr;
    }
    public static int sumEven(int[] sorted){
        int sum = 0;
        for(int i:sorted)
        {
            if(i%2==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static boolean checkSum(int sum){
        if(sum>=15)
            return true;
        else
            return false;
    }

}
