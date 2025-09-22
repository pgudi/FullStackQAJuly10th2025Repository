package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class ImportTasksDemo {
    private static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigate();
        login();
        minimizeFlyOutwindow();
        importTask();
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

    private static void login()
    {
        try
        {
            oBrowser.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
            oBrowser.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
            Robot robot=new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
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

    private static void importTask()
    {
        try
        {
            oBrowser.findElement(By.xpath("//a[@class='content tasks']//div[@class='img']")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//div[contains(text(),'Add New Task')]")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//div[@class='item importTasks ellipsis']")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.id("dropzoneClickableArea")).click();
            Thread.sleep(2000);
            String fileName="E:\\Example\\Sample.csv";
            copyFile(fileName);
            Robot robot=new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);

            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);

            Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(1000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void copyFile(String fileName)
    {
        StringSelection selection=new StringSelection(fileName);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
    }
}
