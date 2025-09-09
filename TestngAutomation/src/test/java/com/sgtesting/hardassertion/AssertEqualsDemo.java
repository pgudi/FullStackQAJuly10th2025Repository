package com.sgtesting.hardassertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsDemo {

    @Test
    public void assertEqualsTesting()
    {
        String s1="Welcome";
        String s2=new String("Welcome");
        Assert.assertEquals(s1, s2);
        System.out.println("This line executed after assertEquals has passed!!");
    }

    @Test
    public void assertNotEqualsTesting()
    {
        String s1="Welcome";
        String s2=new String("Welcome123");
        Assert.assertNotEquals(s1, s2);
        System.out.println("This line executed after assertNotEquals has passed!!");
    }
}
