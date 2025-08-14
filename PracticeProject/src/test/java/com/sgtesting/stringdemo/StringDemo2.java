package com.sgtesting.stringdemo;
class Student
{
    String firstName;
    String courseName;

    Student(String firstName, String courseName)
    {
        this.firstName=firstName;
        this.courseName=courseName;
    }

    public String toString()
    {
        return "Student Name is "+firstName+" and Course Name is "+courseName;
    }
}
public class StringDemo2 {
    public static void main(String[] args) {
        Student obj=new Student("Santosh","Research");
        System.out.println(obj);
    }
}
