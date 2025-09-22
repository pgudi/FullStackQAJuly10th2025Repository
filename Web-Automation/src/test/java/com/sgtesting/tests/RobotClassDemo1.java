package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotClassDemo1 {
    private static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigate();
        login();
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

    private static void navigate()
    {
        try
        {
            oBrowser.get("http://localhost/login.do");
            Thread.sleep(2000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void login()
    {
        try
        {
            oBrowser.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
            oBrowser.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
            Robot robot=new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(4000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }


}
