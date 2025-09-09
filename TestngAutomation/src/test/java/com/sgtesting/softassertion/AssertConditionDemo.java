package com.sgtesting.softassertion;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertConditionDemo {
    private static SoftAssert obj=null;
    @Test
    public void assertTrueTesting()
    {
        obj=new SoftAssert();
        int x,y;
        x=100;y=240;
        obj.assertTrue(x<=y);
        System.out.println("This line executed after assertTrue has passed!!");
        obj.assertAll();
    }

    @Test
    public void assertFalseTesting()
    {
        obj=new SoftAssert();
        int x,y;
        x=100;y=240;
        obj.assertFalse(x>=y);
        System.out.println("This line executed after assertFalse has passed!!");
        obj.assertAll();
    }
}
