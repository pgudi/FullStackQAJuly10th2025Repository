package com.sgtesting.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogoutDemo {
    private static WebDriver oBrowser=null;
    private static ActiPage oPage=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
        login();
        logout();
        closeApplication();
    }

    private static void launchBrowser()
    {
        try
        {
           // oBrowser=new FirefoxDriver();
            oBrowser=new ChromeDriver();
            oPage = new ActiPage(oBrowser);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void navigateURL()
    {
        try
        {
            oBrowser.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            Thread.sleep(4000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void login()
    {
        try
        {
            oPage.getUsername().sendKeys("Admin");
            oPage.getPassword().sendKeys("admin123");
            oPage.getoSubmit().click();
            Thread.sleep(4000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void logout()
    {
        try
        {
            oPage.getoProfilePicture().click();
            Thread.sleep(2000);
            oPage.getoLogout().click();
            Thread.sleep(2000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void closeApplication()
    {
        try
        {
            oBrowser.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
