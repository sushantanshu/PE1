package com.stackroute.unittest.pe2;

import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExerciseFour {
    public static void main(String []args){
        File file = new File("/home/user/IdeaProjects/input.txt");
        try{
            FileReader fr = new FileReader(file);
            String st;
            int i;
            int count=0;
            while ((i=fr.read()) != -1){
                System.out.print((char) i);
                count++;
            }
            System.out.println("\nLength of the file is "+count +" bytes");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
