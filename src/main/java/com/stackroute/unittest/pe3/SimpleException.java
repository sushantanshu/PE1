package com.stackroute.unittest.pe3;

public class SimpleException {
    public static void main(String args[]) {
        try {
            throw new Exception("An exception in main");
        } catch(Exception e) {
            System.out.println(
                    "e.getMessage() = " + e.getMessage());
        } finally {
            System.out.println("In finally clause");
        }
    }
}
