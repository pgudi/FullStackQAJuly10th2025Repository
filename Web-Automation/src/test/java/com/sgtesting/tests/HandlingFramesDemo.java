package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesDemo {
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
            oBrowser.get("https://docs.oracle.com/javase/8/docs/api/");
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
            oBrowser.findElement(By.xpath("//a[normalize-space()='java.awt']")).click();
            Thread.sleep(2000);
            oBrowser.switchTo().defaultContent();
            oBrowser.switchTo().frame("packageFrame");
            oBrowser.findElement(By.xpath("//span[normalize-space()='ActiveEvent']")).click();
            Thread.sleep(2000);
            oBrowser.switchTo().defaultContent();
            WebElement oEle=oBrowser.findElement(By.xpath("//frame[@title='Package, class and interface descriptions']"));
            oBrowser.switchTo().frame(oEle);
            WebElement oTextContent=oBrowser.findElement(By.xpath("/html/body/div[4]/div[1]/ul/li/div"));
            System.out.println(oTextContent.getText());
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
