package com.stackroute.unittest.pe3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FirstLastWeekDay {
    public  static void main(String []args){
        System.out.println(getFirstLastWeekDay());
    }
    public static String getFirstLastWeekDay(){
        String res ="";
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
        System.out.println();
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        res+=(df.format(cal.getTime())+"\n");
        for (int i = 0; i <6; i++) {
            cal.add(Calendar.DATE, 1);
        }
        res+=(df.format(cal.getTime())+"\n");
        return res;
    }
}
