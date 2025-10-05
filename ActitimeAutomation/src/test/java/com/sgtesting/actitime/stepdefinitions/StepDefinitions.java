package com.sgtesting.actitime.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StepDefinitions {

    private static WebDriver oBrowser=null;
    public Logger log= LogManager.getLogger("BDD Automation");
    @Given("^I launch chrome Browser$")
    public void I_launch_chrome_Browser()
    {
        try
        {
            log.info("I launch chrome Browser");
            oBrowser=new ChromeDriver();
            oBrowser.manage().window().maximize();
        } catch (Exception e)
        {
            log.error("There is an execption araised during Execution of Step I_launch_chrome_Browser, The Exception :"+e);
        }
    }

    @When("^I navigate application url$")
    public void I_navigate_application_url()
    {
        try
        {
            log.info("I navigate application url");
            oBrowser.navigate().to("http://localhost/login.do");
            Thread.sleep(5000);
        }catch (Exception e)
        {
            log.error("There is an execption araised during Execution of Step I_navigate_application_url, The Exception :"+e);
        }
    }

    @Then("^I close chrome browser$")
    public void I_close_chrome_browser()
    {
        try
        {
            log.info("I close chrome browser");
            oBrowser.quit();
        }catch (Exception e)
        {
            log.error("There is an execption araised during Execution of Step I_close_chrome_browser, The Exception :"+e);
        }
    }

    @And("^I find the login Page$")
    public void i_find_the_login_page() {
        String actual, expected;
        try
        {
            log.info("I find the login Page");
            expected="actiTIME - Login";
            actual=oBrowser.getTitle();
            Assert.assertEquals(actual, expected);
        }catch (Exception e)
        {
            log.error("There is an execption araised during Execution of Step i_find_the_login_page, The Exception :"+e);
        }
    }
    @When("^I enter username in username text field$")
    public void i_enter_username_in_username_text_field() {
        try
        {
            log.info("I enter username in username text field");
            oBrowser.findElement(By.id("username")).sendKeys("admin");
        }catch (Exception e)
        {
            log.error("There is an execption araised during Execution of Step i_enter_username_in_username_text_field, The Exception :"+e);
        }
    }
    @And("^I enter password in password text field$")
    public void i_enter_password_in_password_text_field() {
        try
        {
            log.info("I enter password in password text field");
            oBrowser.findElement(By.name("pwd")).sendKeys("manager");
        }catch (Exception e)
        {
            log.error("There is an execption araised during Execution of Step i_enter_password_in_password_text_field, The Exception :"+e);
        }
    }
    @And("^I click on Login Button in login page$")
    public void i_click_on_login_button_in_login_page() {
        try
        {
            log.info("I click on Login Button in login page");
            oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
            Thread.sleep(4000);

        }catch (Exception e)
        {
            log.error("There is an execption araised during Execution of Step i_click_on_login_button_in_login_page, The Exception :"+e);
        }
    }
    @Then("^I find the home Page$")
    public void i_find_the_home_page() {
        try
        {
            log.info("I find the home Page");
            WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
            Assert.assertTrue(oEle.isDisplayed());
        }catch (Exception e)
        {
            log.error("There is an execption araised during Execution of Step i_find_the_home_page, The Exception :"+e);
        }
    }
    @And("^I minimize the flyout window$")
    public void i_minimize_the_flyout_window() {
        try
        {
            log.info("I minimize the flyout window");
            oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
            Thread.sleep(2000);

        }catch (Exception e)
        {
            log.error("There is an execption araised during Execution of Step i_minimize_the_flyout_window, The Exception :"+e);
        }
    }


    @When("^I click on Logout Link$")
    public void i_click_on_logout_link() {
        try
        {
            log.info("I click on Logout Link");
            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(2000);

        }catch (Exception e)
        {
            log.error("There is an execption araised during Execution of Step i_click_on_logout_link, The Exception :"+e);
        }
    }


    @When("I click on User Menu")
    public void i_click_on_user_menu() {
        try
        {
            log.info("I click on User Menu");
            oBrowser.findElement(By.xpath("//a[@class='content users']//div[@class='img']")).click();
            Thread.sleep(2000);
        }catch (Exception e)
        {
            log.error("There is an execption araised during Execution of Step i_click_on_user_menu, The Exception :"+e);
        }
    }
    @And("I click on Add User button")
    public void i_click_on_add_user_button() {
        try
        {
            log.info("I click on Add User button");
            oBrowser.findElement(By.xpath("//div[@class='buttonText']")).click();
            Thread.sleep(2000);
        }catch (Exception e)
        {
            log.error("There is an execption araised during Execution of Step i_click_on_add_user_button, The Exception :"+e);
        }
    }
    @When("I enter firstname in firstname text field")
    public void i_enter_firstname_in_firstname_text_field() {
        try
        {
            log.info("I enter firstname in firstname text field");
            oBrowser.findElement(By.name("firstName")).sendKeys("demo");
        }catch (Exception e)
        {
            log.error("There is an execption araised during Execution of Step i_enter_firstname_in_firstname_text_field, The Exception :"+e);
        }
    }
    @And("I enter lastname in lastname text field")
    public void i_enter_lastname_in_lastname_text_field() {
        try
        {
            log.info("I enter lastname in lastname text field");
            oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("User1");
        }catch (Exception e)
        {
            log.error("There is an execption araised during Execution of Step i_enter_lastname_in_lastname_text_field, The Exception :"+e);
        }
    }
    @And("I enter email in email text field")
    public void i_enter_email_in_email_text_field() {
        try
        {
            log.info("I enter email in email text field");
            oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
        }catch (Exception e)
        {
            log.error("There is an execption araised during Execution of Step i_enter_email_in_email_text_field, The Exception :"+e);
        }
    }
    @And("I enter username in username text field of userpage")
    public void i_enter_username_in_username_text_field_of_userpage() {
        try
        {
            log.info("I enter username in username text field of userpage");
            oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("demoUser1");
        }catch (Exception e)
        {
            log.error("There is an execption araised during Execution of Step i_enter_username_in_username_text_field_of_userpage, The Exception :"+e);
        }
    }
    @And("I enter password in password text field of userpage")
    public void i_enter_password_in_password_text_field_of_userpage() {
        try
        {
            log.info("I enter password in password text field of userpage");
            oBrowser.findElement(By.name("password")).sendKeys("1234");
        }catch (Exception e)
        {
            log.error("There is an execption araised during Execution of Step i_enter_password_in_password_text_field_of_userpage, The Exception :"+e);
        }
    }
    @And("I enter password in retypepassword text field of userpage")
    public void i_enter_password_in_retypepassword_text_field_of_userpage() {
        try
        {
            log.info("I enter password in retypepassword text field of userpage");
            oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("1234");
        }catch (Exception e)
        {
            log.error("There is an execption araised during Execution of Step i_enter_password_in_retypepassword_text_field_of_userpage, The Exception :"+e);
        }
    }
    @And("I click on create user button in userpage")
    public void i_click_on_create_user_button_in_userpage() {
        try
        {
            log.info("I click on create user button in userpage");
            oBrowser.findElement(By.xpath("//span[normalize-space()='Create User']")).click();
            Thread.sleep(4000);
        }catch (Exception e)
        {
            log.error("There is an execption araised during Execution of Step i_click_on_create_user_button_in_userpage, The Exception :"+e);
        }
    }
    @Then("I find the created user in the user list page")
    public void i_find_the_created_user_in_the_user_list_page() {
        try
        {
            log.info("I find the created user in the user list page");
            WebElement oUser=oBrowser.findElement(By.xpath("//span[text()='User1, demo']"));
            Assert.assertTrue(oUser.isDisplayed());
        }catch (Exception e)
        {
            log.error("There is an execption araised during Execution of Step i_find_the_created_user_in_the_user_list_page, The Exception :"+e);
        }
    }
    @When("I click on newly created user")
    public void i_click_on_newly_created_user() {
        try
        {
            log.info("I click on newly created user");
            oBrowser.findElement(By.xpath("//span[text()='User1, demo']")).click();
            Thread.sleep(2000);
        }catch (Exception e)
        {
            log.error("There is an execption araised during Execution of Step i_click_on_newly_created_user, The Exception :"+e);
        }
    }
    @And("I click on Delete User button")
    public void i_click_on_delete_user_button() {
        try
        {
            log.info("I click on Delete User button");
            oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
            Thread.sleep(2000);
        }catch (Exception e)
        {
            log.error("There is an execption araised during Execution of Step i_click_on_delete_user_button, The Exception :"+e);
        }
    }
    @And("I click on OK button in Alert Window")
    public void i_click_on_ok_button_in_alert_window() {
        try
        {
            log.info("I click on OK button in Alert Window");
            Alert oAlert =oBrowser.switchTo().alert();
            String content=oAlert.getText();
            System.out.println("Content :"+content);
            oAlert.accept();
            Thread.sleep(2000);
        }catch (Exception e)
        {
            log.error("There is an execption araised during Execution of Step i_click_on_ok_button_in_alert_window, The Exception :"+e);
        }
    }
}
