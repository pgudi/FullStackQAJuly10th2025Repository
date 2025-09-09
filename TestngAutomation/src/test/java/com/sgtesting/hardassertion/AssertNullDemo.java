package com.sgtesting.hardassertion;

import org.junit.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class AssertNullDemo {

    @Test
    public void assertNullTesting()
    {
        File f1=null;
        Assert.assertNull(f1);
        System.out.println("This line executed after assertNull has passed!!");
    }

    @Test
    public void assertNotNullTesting()
    {
        File f1=null;
        f1=new File("D:\\Example");
        Assert.assertNotNull(f1);
        System.out.println("This line executed after assertNotNull has passed!!");
    }
}
