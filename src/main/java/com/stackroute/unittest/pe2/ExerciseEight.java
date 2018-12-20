package com.stackroute.unittest.pe2;

import java.io.File;
import java.io.FilenameFilter;

public class ExerciseEight {
    public  static void  main(String []args){

    }
}
class MyFileFilter {

    public  void filter(){
        File file = new File("C:/MyFolder/");
        String[] files = file.list(new FilenameFilter() {

            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".txt")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(String f:files){
            System.out.println(f);
        }
    }
}
