package com.school;

public class Course {
    private static int courseIdCounter = 101;
    int courseId; 
    String courseName;

    public Course(String courseName){
        this.courseId = courseIdCounter++;
        this.courseName = courseName;
    }

    public void displayDetails() {
        System.out.println("Course ID: " + this.courseId + ", Name: " + this.courseName);
    }
}