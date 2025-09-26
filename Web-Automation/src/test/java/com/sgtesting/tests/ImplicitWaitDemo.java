package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitDemo {
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
            oBrowser.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
            oBrowser.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
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
            oBrowser.findElement(By.cssSelector("a[id='loginButton'] div")).click();

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
