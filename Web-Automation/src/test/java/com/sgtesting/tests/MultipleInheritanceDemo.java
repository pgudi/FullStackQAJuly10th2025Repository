package com.sgtesting.tests;
interface University
{
    void showUniversityName(String name);
}

interface College
{
    void displayCollegeName(String name);
}

class EngineeringCollege implements College, University
{

    @Override
    public void displayCollegeName(String name) {
        System.out.println("Engineering College Name :"+name);
    }

    @Override
    public void showUniversityName(String name) {
        System.out.println("Engineering University Name :"+name);
    }
}
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        University university=new EngineeringCollege();
        university.showUniversityName("VTU Belguam");

        College college = (College) university;
        college.displayCollegeName("BMS Engineering Colege");
    }
}
