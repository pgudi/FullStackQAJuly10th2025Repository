package com.sgtesting.parameters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

    @Test(dataProvider = "credentails")
    public void login(String username,String password)
    {
        System.out.println("User Name :"+username+", Pasword :"+password);
    }

    @DataProvider(name = "credentails")
    public Object[][] getLoginCredentails()
    {
        return new Object[][] {{"user1","Welcome@1"},
                {"user2","Welcome@2"},
                {"user3","Welcome@3"}};
    }
}
