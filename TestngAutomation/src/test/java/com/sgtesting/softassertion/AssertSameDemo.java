package com.sgtesting.softassertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertSameDemo {
    private static SoftAssert obj=null;
    @Test
    public void assertSameTesting()
    {
        obj=new SoftAssert();
        String s1="Welcome";
        String s2="Welcome";
        obj.assertSame(s1, s2);
        System.out.println("This line executed after assertSame has passed!!");
        obj.assertAll();
    }

    @Test
    public void assertNotSameTesting()
    {
        obj=new SoftAssert();
        String s1="Welcome";
        String s2=new String("Welcome");
        obj.assertNotSame(s1, s2);
        System.out.println("This line executed after assertNotSame has passed!!");
        obj.assertAll();
    }
}
