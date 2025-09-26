package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverWaitDemo {
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
            WebDriverWait wait =new WebDriverWait(oBrowser,Duration.ofSeconds(30));
       //     wait.until(ExpectedConditions.titleContains("actiTIME - Login"));
       //     wait.until(ExpectedConditions.titleIs("actiTIME - Login"));
       //     wait.until(ExpectedConditions.attributeToBe(By.id("username"),"placeholder","Username"));
              WebElement oEle=oBrowser.findElement(By.xpath("//div[normalize-space()='Login']"));
              wait.until(ExpectedConditions.textToBePresentInElement(oEle,"Login"));
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
