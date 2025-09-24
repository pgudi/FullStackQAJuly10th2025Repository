package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {
    private static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
        displayTitle();
        displayURL();
        showLinksCount();
        enterTextInTextField1();
        enterTextInTextField2();
    //    clickButtonField1();
        clickButtonField2();
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

    private static void displayTitle()
    {
        JavascriptExecutor js= (JavascriptExecutor) oBrowser;
        String title= (String) js.executeScript("var kk=document.title;return kk;");
        System.out.println("Title of Application :"+title);
    }

    private static void displayURL()
    {
        JavascriptExecutor js= (JavascriptExecutor) oBrowser;
        String url= (String) js.executeScript("var kk=document.URL;return kk;");
        System.out.println("URL of Application :"+url);
    }

    private static void showLinksCount()
    {
        JavascriptExecutor js= (JavascriptExecutor) oBrowser;
        long linksCount= (long) js.executeScript("var kk=document.getElementsByTagName('A');return kk.length;");
        System.out.println("Number of Links in the Application:"+linksCount);
    }

    private static void enterTextInTextField1()
    {
        JavascriptExecutor js= (JavascriptExecutor) oBrowser;
        js.executeScript("document.getElementById('uid1user1name1').value='DemoUser1';");
    }

    private static void enterTextInTextField2()
    {
        JavascriptExecutor js= (JavascriptExecutor) oBrowser;
        WebElement oText=oBrowser.findElement(By.id("pwd1pass1word1"));
        js.executeScript("arguments[0].value='Welcome12345';",oText);
    }

    private static void clickButtonField1()
    {
        JavascriptExecutor js= (JavascriptExecutor) oBrowser;
        js.executeScript("document.getElementById('btn1submit1button1').click();");
    }

    private static void clickButtonField2()
    {
        JavascriptExecutor js= (JavascriptExecutor) oBrowser;
        WebElement oButton=oBrowser.findElement(By.id("btn1submit1button1"));
        js.executeScript("arguments[0].click();",oButton);
    }

}
