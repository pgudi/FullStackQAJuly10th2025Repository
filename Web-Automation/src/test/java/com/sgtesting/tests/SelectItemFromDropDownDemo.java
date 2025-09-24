package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectItemFromDropDownDemo {
    private static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
        selectItems();
    }

    private static void launchBrowser()
    {
        try
        {
            oBrowser = new ChromeDriver();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void navigateURL()
    {
        try
        {
            oBrowser.get("file:///D:/HTML/Sample.html");
            Thread.sleep(4000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void selectItems()
    {
        try
        {
            WebElement oDropdown=oBrowser.findElement(By.id("tools"));
            Select oSelect =new Select(oDropdown);
            //Visiable Text
            oSelect.selectByVisibleText("Selenium WebDriver");
            Thread.sleep(2000);
            oSelect.selectByValue("ide");
            Thread.sleep(2000);
            oSelect.selectByIndex(2);
            Thread.sleep(2000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
