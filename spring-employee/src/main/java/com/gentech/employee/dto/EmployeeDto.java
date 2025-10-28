package com.gentech.employee.dto;

import java.util.Date;


public class EmployeeDto {
    private Integer id;
    private String ename;
    private String emailId;
    private String jobName;
    private double salary;
    private String cityName;
    private String stateName;
    private Date createdAt;
    private Date updatedAt;

    public EmployeeDto(){

    }
    public EmployeeDto(Integer id, String ename, String emailId, String jobName, double salary, String cityName, String stateName, Date createdAt, Date updatedAt) {
        this.id = id;
        this.ename = ename;
        this.emailId = emailId;
        this.jobName = jobName;
        this.salary = salary;
        this.cityName = cityName;
        this.stateName = stateName;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
