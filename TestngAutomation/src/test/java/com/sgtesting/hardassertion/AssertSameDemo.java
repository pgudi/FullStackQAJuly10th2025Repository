package com.sgtesting.hardassertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertSameDemo {

    @Test
    public void assertSameTesting()
    {
        String s1="Welcome";
        String s2="Welcome";
        Assert.assertSame(s1, s2);
        System.out.println("This line executed after assertSame has passed!!");
    }

    @Test
    public void assertNotSameTesting()
    {
        String s1="Welcome";
        String s2=new String("Welcome123");
        Assert.assertNotSame(s1, s2);
        System.out.println("This line executed after assertNotSame has passed!!");
    }
}
