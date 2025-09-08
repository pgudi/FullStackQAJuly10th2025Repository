package com.sgtesting.products;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Products {

    @Test
    public void createProduct()
    {
        System.out.println("The product demoProduct has created successfully");
    }

    @Test
    public void modifyProduct()
    {
        System.out.println("The product demoProduct has modified successfully");
    }

    @Test
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
