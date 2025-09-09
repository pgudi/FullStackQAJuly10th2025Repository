package com.sgtesting.conditions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Products {

    @Test(priority = 1)
    public void createProduct()
    {
        System.out.println("The product demoProduct has created successfully");
    }

    @Test(priority = 2)
    public void modifyProduct()
    {
        System.out.println("The product demoProduct has modified successfully");
    }

    @Test(priority = 3)
    public void deleteProduct()
    {
        System.out.println("The product demoProduct has deleted successfully");
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
