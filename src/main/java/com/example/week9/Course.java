package com.example.week9;

public class Course {

    private int crn;
    private String courseCode, courseName;


    /**
     * constructor for the course class
     */
    public Course(int crn, String courseCode, String courseName) {
        setCrn(crn);
        this.courseCode = courseCode;
        this.courseName = courseName;
    }






    /**
     * set method for crn num
     * it has to have 5 digits to be a valid crn number
     */
    public void setCrn(int crn) {
        if (crn >= 10000 && crn <= 99999) {
            this.crn = crn;
        } else {
            throw new IllegalArgumentException("CRN must be in the range 10000-99999");
        }
    }






    /**
     * a valid course code has 4 uppercase letter followed by 4 numbers
     * examples are: COMP 1008, MGMT 2003, etc
     */
    public void setCourseCode (String courseCode) {
        //regular expressions can help filter the pattern for us
        String courseCodePattern = "[A-Z]{4}\\s[0-9]{4}";
        courseCode = courseCode.toUpperCase();

        //if the course code passed in matches the course code patter regex, set the course code in the class object constructor
        if (courseCode.matches(courseCodePattern)) {
            this.courseCode = courseCode;
        } else {
            throw new IllegalArgumentException("Course code must have 4 letters, a space and 4 digits (ex: COMP 1008");
        }
    }





    

    /**
     * a course name should describe what the course is about
     */
    public void setCourseName (String courseName) {
        courseName = courseName.trim(); //this removes leading and trailing whitespaces
        if (courseName.length() >= 2 && courseName.length() <= 30) {
            this.courseName = courseName;
        } else {
            throw new IllegalArgumentException("course name must be 2 to 30 characters in length");
        }
    }



}
