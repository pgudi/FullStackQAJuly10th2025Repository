package com.sgtesting.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiPage {
    public ActiPage(WebDriver oBrowser)
    {
        PageFactory.initElements(oBrowser, this);
    }
    // userName in Login Page
    private WebElement username;

    //Password in Login Page
    private WebElement password;

    //Submit button in Login page
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement oSubmit;

    // Profile Picture in Home Page
    @FindBy(xpath = "//img[@class='oxd-userdropdown-img']")
    private WebElement oProfilePicture;

    //Logout Link in Home Page
    @FindBy(xpath = "(//a[@class='oxd-userdropdown-link'])[4]")
    private WebElement oLogout;

    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getoSubmit() {
        return oSubmit;
    }

    public WebElement getoProfilePicture() {
        return oProfilePicture;
    }

    public WebElement getoLogout() {
        return oLogout;
    }
}
