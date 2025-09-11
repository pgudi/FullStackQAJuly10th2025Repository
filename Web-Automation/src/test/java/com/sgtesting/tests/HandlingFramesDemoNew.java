package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesDemoNew {
    private static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
        handlingFrames();
    }

    private static void launchBrowser()
    {
        try
        {
            oBrowser=new ChromeDriver();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void navigateURL()
    {
        try
        {
            oBrowser.get("file:///D:/HTML/FramesDemo.html");
            Thread.sleep(4000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void handlingFrames()
    {
        try
        {
            oBrowser.switchTo().frame(0);
            oBrowser.findElement(By.id("uid1user1name1")).sendKeys("DemoUser123");
            Thread.sleep(2000);
            oBrowser.switchTo().defaultContent();
            oBrowser.switchTo().frame(1);
            oBrowser.findElement(By.id("edit1")).sendKeys("45000");
            Thread.sleep(2000);

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
