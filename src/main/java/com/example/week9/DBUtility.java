package com.example.week9;

public class DBUtility {
    /**
     * user and password of my mySQL Work bench java database
     */
    private static String user = "root";
    private static String password = "Nico4444!";


    //telling the system which SQL driver to use
    //127.0.01:3306 - tells java that mySQL server is at that ip and the port number 3306
    //edmuse2023 is the database name we are using
    private static String connectUrl = "jdbc:mysql//127.0.0.1:3306/edmuse2023";


}
