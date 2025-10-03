package com.sgtesting.actitime.driverscript;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/FeatureFiles",
        glue = "com.sgtesting.actitime.stepdefinitions",
        plugin = {"pretty", "html:Reports/cucumber-html-report.html"},
        tags = "@Execute"
)
public class DriverScript extends AbstractTestNGCucumberTests {
}
