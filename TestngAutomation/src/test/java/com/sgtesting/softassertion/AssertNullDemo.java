package com.sgtesting.softassertion;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;

public class AssertNullDemo {
    private static SoftAssert obj=null;
    @Test
    public void assertNullTesting()
    {
        obj=new SoftAssert();
        File f1=null;
        obj.assertNull(f1);
        System.out.println("This line executed after assertNull has passed!!");
        obj.assertAll();
    }

    @Test
    public void assertNotNullTesting()
    {
        obj=new SoftAssert();
        File f1=null;
        f1=new File("D:\\Example");
        obj.assertNotNull(f1);
        System.out.println("This line executed after assertNotNull has passed!!");
        obj.assertAll();
    }
}
