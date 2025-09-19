package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSeelctorDemo {
    private static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
    //    absoluteCSSPath();
    //    relativeCSSPath();
    //    relativeCSSWithTagNameAndIdAttributeValue();
    //    relativeCSSWithIdAttributeValueAlone();
    //    relativeCSSWithTagNameAndClassAttributeValue();
    //    relativeCSSWithClassAttributeValueAlone();
        relativeCSSWithTagNameAndAttributeNameValue();
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

    private static void absoluteCSSPath()
    {
        oBrowser.findElement(By.cssSelector("html body div form input")).sendKeys("DemoUser1");
    }

    /**
     * case 1 : identify Element using tagName
     */
    private static void relativeCSSPath()
    {
        oBrowser.findElement(By.cssSelector("input")).sendKeys("DemoUser1");
    }

    /**
     * case 2 : identify Element using tagName with id attribute value
     */
    private static void relativeCSSWithTagNameAndIdAttributeValue()
    {
        oBrowser.findElement(By.cssSelector("input#pwd1pass1word1")).sendKeys("DemoUser1");
    }

    /**
     * case 3 : identify Element using id attribute value alone
     */
    private static void relativeCSSWithIdAttributeValueAlone()
    {
        oBrowser.findElement(By.cssSelector("#pwd1pass1word1")).sendKeys("DemoUser1");
    }

    /**
     * case 4 : identify Element using tagName with class attribute value
     */
    private static void relativeCSSWithTagNameAndClassAttributeValue()
    {
        oBrowser.findElement(By.cssSelector("input.pass1word1")).sendKeys("DemoUser1");
    }

    /**
     * case 5 : identify Element using class attribute value alone
     */
    private static void relativeCSSWithClassAttributeValueAlone()
    {
        oBrowser.findElement(By.cssSelector(".pass1word1")).sendKeys("DemoUser1");
    }

    /**
     * case 6 : identify Element using tagName With Attribute Name and Value
     * syntax: <tagName>[attributeName=attributeValue]
     */
    private static void relativeCSSWithTagNameAndAttributeNameValue()
    {
        oBrowser.findElement(By.cssSelector("input[value='Submit']")).click();
    }
}
