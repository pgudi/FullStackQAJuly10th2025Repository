package com.sgtesting.hardassertion;

import org.junit.Assert;
import org.testng.annotations.Test;

public class AssertConditionDemo {

    @Test
    public void assertTrueTesting()
    {
        int x,y;
        x=100;y=240;
        Assert.assertTrue(x<=y);
        System.out.println("This line executed after assertTrue has passed!!");
    }

    @Test
    public void assertFalseTesting()
    {
        int x,y;
        x=100;y=240;
        Assert.assertFalse(x>=y);
        System.out.println("This line executed after assertFalse has passed!!");
    }
}
