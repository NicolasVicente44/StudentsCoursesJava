package com.example.week9;

import java.util.ArrayList;

public class Tester {
    public static void main (String[] args) {
        ArrayList<Course> courses = DBUtility.getCoursesFromDB();
        System.out.println(courses);
    }
}
