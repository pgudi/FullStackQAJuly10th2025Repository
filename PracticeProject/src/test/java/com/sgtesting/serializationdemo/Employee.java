package com.sgtesting.serializationdemo;

import java.io.Serializable;

public class Employee implements Serializable {

    String ename;
    String jobName;
    double salary;

    Employee(String ename,String jobName,double salary)
    {
        this.ename=ename;
        this.jobName=jobName;
        this.salary=salary;
    }

    public void showEmployeeName()
    {
        System.out.println("Employee Name :"+ename);
    }

    public void showJobName()
    {
        System.out.println("Employee Job Name :"+jobName);
    }

    public void showSalary()
    {
        System.out.println("Employee Salary :"+salary);
    }
}
