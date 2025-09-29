package com.sgtesting.actitime.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {

    private static WebDriver oBrowser=null;

    @Given("^I launch chrome Browser$")
    public void I_launch_chrome_Browser()
    {
        try
        {
            oBrowser=new ChromeDriver();
            oBrowser.manage().window().maximize();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @When("^I navigate application url$")
    public void I_navigate_application_url()
    {
        try
        {
            oBrowser.navigate().to("http://localhost/login.do");
            Thread.sleep(5000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Then("^I close chrome browser$")
    public void I_close_chrome_browser()
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
