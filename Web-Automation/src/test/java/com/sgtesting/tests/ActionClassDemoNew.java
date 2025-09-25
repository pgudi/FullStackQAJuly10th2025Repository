package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemoNew {
    private static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigate();
        mouseAction();
    }

    private static void launchBrowser()
    {
        try
        {
            oBrowser=new ChromeDriver();
            oBrowser.manage().window().maximize();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void navigate()
    {
        try
        {
            oBrowser.get("https://www.flipkart.com/");
            Thread.sleep(5000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void mouseAction()
    {
        try
        {
            Actions oMouse =new Actions(oBrowser);
            WebElement oEle = oBrowser.findElement(By.xpath("//span[contains(text(),'Electronics')]"));
            oMouse.click(oEle).build().perform();
            Thread.sleep(2000);
            WebElement oMen=oBrowser.findElement(By.xpath("//span[normalize-space()='Men']"));
            oMouse.moveToElement(oMen).build().perform();
            Thread.sleep(2000);
            WebElement oWatches =oBrowser.findElement(By.xpath("//a[normalize-space()='Fossil']"));
            oMouse.click(oWatches).build().perform();
            Thread.sleep(2000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
