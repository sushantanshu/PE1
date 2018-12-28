package com.stackroute.unittest.pe3;

import java.util.Scanner;

public class ArrayOfPlaces {
    public static void main(String[] args){
        System.out.println("Input your places seperated by comma : ");
        Scanner in = new Scanner(System.in);
        String[] places = in.nextLine().split(",");
        System.out.println("You have entered the following places : ");
        for(int i=0;i<places.length;i++){
            System.out.println(places[i]);
        }
        System.out.println("Places after removing vowels : ");

        String[] placesCon = removeVowels(places);
        for(int i=0;i<placesCon.length;i++){
            System.out.println("Place Name without Vowels : "+i+" "+placesCon[i] );
        }


    }
    public static String[] removeVowels(String[] places){
        for(int i=0;i<places.length;i++){
            places[i]= places[i].replaceAll("[aeiou]","");
        }
        return places;
    }
}
