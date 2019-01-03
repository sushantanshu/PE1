package com.stackroute.unittest.pe5;

import java.util.ArrayList;

public class ArrayUpdation {

    public static  void main(String[] args){
        ArrayList<String> al = new ArrayList<>();
        al.add("Apple");
        al.add("Grape");
        al.add("Melon");
        al.add("Berry");
    }
    public static ArrayList updateElement(ArrayList<String> al,String str,String strReplace){
        al.set(al.indexOf(str),strReplace);
        return al;
    }
    public static ArrayList removeAllElements(ArrayList<String> al){
        al = null;
        return al;
    }
}
