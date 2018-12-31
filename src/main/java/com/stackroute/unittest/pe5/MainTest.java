package com.stackroute.unittest.pe5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainTest {
    public static void main(String[] args){
        List<Student> list = new ArrayList<>();
        Student s1 = new Student(12345,"Sushant",22);
        Student s2 = new Student(12346,"Anshu",22);
        Student s3 = new Student(12347,"Ramya",23);
        Student s4 = new Student(12348,"Teju",23);
        Student s5 = new Student(12349,"Siddharth",23);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        System.out.println(list.toString());
        Collections.sort(list,new StudentSorter());
        System.out.println(list.toString());
    }

}

