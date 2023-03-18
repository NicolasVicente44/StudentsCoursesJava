package com.example.week9;

public class Tester {
    public static void main (String[] args) {
        try {

            Course course = new Course(20021, "COMP 1008", "programming fundementals");
            System.out.println(course);

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }
}
