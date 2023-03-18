package com.example.week9;

public class Grade {
    private int studentNum, crn, grade;

    public Grade(int studentNum, int crn, int grade) {
        setStudentNum(studentNum);
        setCrn(crn);
        setGrade(grade);
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public int getCrn() {
        return crn;
    }

    public void setCrn(int crn) {
        this.crn = crn;
    }

    public int getGrade() {
        return grade;
    }


    /**
     * this will validate that a grade is in the range of 0-100
     */
    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            throw new IllegalArgumentException("grade must be between 0-100");
        }
    }



    public String toString () {


        return String.format("%d-%d-%d", studentNum, crn, grade);


    }

}
