package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateUserScenario {
    private static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
        login();
        minimizeFlyOutwindow();
        createUser();
        deleteUser();
        logout();
        closeApplication();
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
            oBrowser.get("http://localhost/login.do");
            Thread.sleep(4000);
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
            Thread.sleep(4000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void minimizeFlyOutwindow()
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

    private static void createUser()
    {
        try
        {
            oBrowser.findElement(By.xpath("//a[@class='content users']//div[@class='img']")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//div[@class='buttonText']")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.name("firstName")).sendKeys("demo");
            oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("User1");
            oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
            oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("demoUser1");
            oBrowser.findElement(By.name("password")).sendKeys("WelcomeDemo@123$");
            oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("WelcomeDemo@123$");
            oBrowser.findElement(By.xpath("//span[normalize-space()='Create User']")).click();
            Thread.sleep(4000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void deleteUser()
    {
        try
        {
            oBrowser.findElement(By.xpath("//span[normalize-space()='User1, demo']")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
            Thread.sleep(2000);
            Alert oAlert =oBrowser.switchTo().alert();
            String contetn=oAlert.getText();
            System.out.println(contetn);
            oAlert.accept();
            Thread.sleep(2000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void logout()
    {
        try
        {
            oBrowser.findElement(By.xpath("//a[@id='logoutLink']")).click();
            Thread.sleep(2000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void closeApplication()
    {
        try
        {
            oBrowser.quit();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
