package com.sgtesting.softassertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqualsDemo {
    private static SoftAssert obj=null;
    @Test
    public void assertEqualsTesting()
    {
        obj=new SoftAssert();
        String s1="Welcome";
        String s2=new String("Welcome");
        obj.assertEquals(s1, s2);
        System.out.println("This line executed after assertEquals has passed!!");
        obj.assertAll();
    }

    @Test
    public void assertNotEqualsTesting()
    {
        obj=new SoftAssert();
        String s1="Welcome";
        String s2=new String("Welcome123");
        obj.assertNotEquals(s1, s2);
        System.out.println("This line executed after assertNotEquals has passed!!");
        obj.assertAll();
    }
}
