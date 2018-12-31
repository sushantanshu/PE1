package com.stackroute.unittest.pe5;

import java.util.Comparator;

public class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return "id :"+this.id +" name : "+this.name + " age : "+this.age;
    }
}
class StudentSorter implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
         if(a.getAge() == b.getAge()){
             if(a.getName().equals(b.getName())){
                 return a.getId()-b.getId();
             }
             else{
                 return a.getName().compareTo(b.getName());
             }
         }
         return a.getAge()-b.getAge();
    }
}