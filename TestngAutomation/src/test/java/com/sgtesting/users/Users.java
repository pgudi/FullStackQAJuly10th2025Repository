package com.sgtesting.users;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Users {

    @Test
    public void createUser()
    {
        System.out.println("The user demoUser has created successfully");
    }

    @Test
    public void modifyUser()
    {
        System.out.println("The user demoUser has modified successfully");
    }

    @Test
    public void deleteUser()
    {
        System.out.println("The user demoUser has deleted successfully");
    }

    @BeforeClass
    public void setup()
    {
        System.out.println("Launch Browser, Navigate URL and Login into The Application");
    }

    @AfterClass
    public void cleanUp()
    {
        System.out.println("Logout from Application and Close Browser!!");
        System.out.println("++++++++++++++++++++++++++++++++++++");
    }
}
