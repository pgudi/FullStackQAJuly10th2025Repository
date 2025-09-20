package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePopUpBrowsersDemo {
    private static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigate();
        handlePopups();

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

    private static void handlePopups()
    {
        try
        {
            WebElement oLink= oBrowser.findElement(By.linkText("actiTIME Inc."));
            System.out.println("Before Click on Link number of Popups :"+getPopupsCount());
            oLink.click();
            Thread.sleep(2000);
            System.out.println("After Click on Link number of Popups :"+getPopupsCount());
            if(getPopupsCount()>0)
            {
                popupsBrowsers();
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static int getPopupsCount()
    {
        int count=0;
        count=oBrowser.getWindowHandles().size()-1;
        return count;
    }

    private static void popupsBrowsers()
    {
        try
        {
            String parentBrowser;
            parentBrowser=oBrowser.getWindowHandle();
            System.out.println("Parent Brwoser :"+parentBrowser);
            Object[] popups=oBrowser.getWindowHandles().toArray();
            for(int i=1;i<popups.length;i++)
            {
                System.out.println("Child browser :"+popups[i].toString());
                oBrowser.switchTo().window(popups[i].toString());
                String title=oBrowser.getTitle();
                System.out.println("Title :"+title);
                String url=oBrowser.getCurrentUrl();
                System.out.println("URL :"+url);
                Thread.sleep(2000);
                oBrowser.findElement(By.id("cookie-button--got-it")).click();
                Thread.sleep(2000);
                oBrowser.findElement(By.linkText("Get started")).click();
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
