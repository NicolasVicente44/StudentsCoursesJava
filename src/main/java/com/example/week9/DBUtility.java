package com.example.week9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBUtility {
    /**
     * user and password of my mySQL Work bench java database
     */
    private static String user = "root";
    private static String password = "Nico4444!";


    //telling the system which SQL driver to use
    //127.0.01:3306 - tells java that mySQL server is at that ip and the port number 3306
    //edmuse2023 is the database name we are using
    private static String connectUrl = "jdbc:mysql://127.0.0.1:3306/edmuse2023";

    /**
     * this method will connect to the database and create an ArrayList of course objects
     */

    public static ArrayList<Course> getCoursesFromDB() {
        ArrayList<Course> courses = new ArrayList<>();

        //connect to the DB
        //try block with round brackets is a try with resources block. resources will automatically be closed
        //they are opened inside the () block
        try(

                Connection conn = DriverManager.getConnection(connectUrl,user,password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM courses");

                ){
            while (resultSet.next()) {
                int crn = resultSet.getInt("crn");
                String courseCode = resultSet.getString("courseCode");
                String courseName = resultSet.getString("courseName");

                courses.add(new Course(crn, courseCode, courseName));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

        return courses;
    }


}
