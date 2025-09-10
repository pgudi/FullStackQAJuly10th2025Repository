package com.sgtesting.tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginLgoutScenarioNew {
    private WebDriver oBrowser=null;
    @Test(priority = 1)
    public void launchBrowser()
    {
        try
        {
            oBrowser = new ChromeDriver();
            Assert.assertNotNull(oBrowser);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 2, dataProvider = "appurl")
    public void navigate(String url)
    {
        try
        {
            String actual,expected;
            expected="actiTIME - Login";
            oBrowser.get(url);
            actual=oBrowser.getTitle();
            Assert.assertEquals(actual, expected);
            Thread.sleep(4000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 3, dataProvider = "logindata")
    public void login(String user, String password)
    {
        try
        {
            oBrowser.findElement(By.xpath("//input[@id='username']")).sendKeys(user);
            oBrowser.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
            oBrowser.findElement(By.cssSelector("a[id='loginButton'] div")).click();
            Thread.sleep(4000);
            WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
            Assert.assertTrue(oEle.isDisplayed());
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 4)
    public void minimizeFlyOutWindow()
    {
        try
        {
            oBrowser.findElement(By.cssSelector("#gettingStartedShortcutsPanelId")).click();
            Thread.sleep(2000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 5)
    public void logout()
    {
        try
        {
            String actual,expected;
            expected="actiTIME - Login";
            oBrowser.findElement(By.xpath("//a[@id='logoutLink']")).click();
            Thread.sleep(2000);
            actual=oBrowser.getTitle();
            Assert.assertEquals(actual, expected);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 6)
    public void closeApplication()
    {
        try
        {
            oBrowser.quit();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @DataProvider(name = "appurl")
    public Object[][] getURL()
    {
        return new Object[][] {{"http://localhost/login.do"}};
    }

    @DataProvider(name = "logindata")
    public Object[][] getLoginCredentails()
    {
        return new Object[][] {{"admin","manager"}};
    }
}
