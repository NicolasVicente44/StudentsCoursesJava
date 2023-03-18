package com.example.week9;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tester {
    public static void main (String[] args) {
        ArrayList<Course> courses = DBUtility.getCoursesFromDB();
        System.out.println(courses);


        ArrayList<Grade> grades = DBUtility.getGradesFromDB(100000002);
        System.out.println(grades);


        Person person = new Person("Homer", "Simpson", "742 Evergreen Terrace, Springfield, OH", LocalDate.of(1965, 12, 10));
        System.out.println(person);
    }
}
