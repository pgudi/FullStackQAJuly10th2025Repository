package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeOptionsDemo {
    private static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigate();

    }

    private static void launchBrowser()
    {
        try
        {
            ChromeOptions options=new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--disable-notifications");
            oBrowser=new ChromeDriver(options);

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void navigate()
    {
        try
        {
            oBrowser.get("https://www.axisbank.com/");

            Thread.sleep(5000);

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
