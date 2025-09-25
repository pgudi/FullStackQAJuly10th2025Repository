package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemo {
    private static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigate();
    //    basedOnSachinTendulkarNameEnterSalary();
    //    basedOnSachinTendulkarNameEnterSalaryForNextPerson();
    //    makeStatusASActiveForIndianFreeDomFighter();
    //    makeStatusASActiveForPersonWhoIsPreviousToRahulDravid();
    //    basedOnElementIdentifyItsAnyAncestor();
        basedOnParentElementIdentifyItsAnyAChildElement();
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
            oBrowser.get("file:///D:/HTML/WebTableHTML.html");
            Thread.sleep(5000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     *  case 1: following-sibling
     *  Based on Person Name 'Sachin Tendulkar' Enter the salary
     */
    private static void basedOnSachinTendulkarNameEnterSalary()
    {
        oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td/following-sibling::td/following-sibling::td/following-sibling::td/input")).sendKeys("22000");
    }

    /**
     *  case 2: following
     *  Based on Person Name 'Sachin Tendulkar' Enter the salary for Next Person
     */
    private static void basedOnSachinTendulkarNameEnterSalaryForNextPerson()
    {
        oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following::tr[1]/td[6]/input")).sendKeys("22000");
    }

    /**
     *  case 3: preceding-sibling
     *  make Status AS Active For Indian FreeDom Fighter
     */
    private static void makeStatusASActiveForIndianFreeDomFighter()
    {
        oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[1]/preceding-sibling::td[1]/input")).click();
    }

    /**
     *  case 4: preceding
     *   make the status as Active for Peson who is previous to Rahul Dravid
     */
    private static void makeStatusASActiveForPersonWhoIsPreviousToRahulDravid()
    {
        oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/preceding::tr[1]/td/input")).click();
    }

    /**
     *  case 5: ancestor
     *   Based on Element identify its ancestor
     */
    private static void basedOnElementIdentifyItsAnyAncestor()
    {
        WebElement oTable=oBrowser.findElement(By.xpath("//input[@id='edit4']/ancestor::td/ancestor::tr[1]/ancestor::table"));
        System.out.println("id attribute value :"+oTable.getAttribute("id"));
    }


    /**
     *  case 6: descendant
     *   Based on the parent Element identify the child Element
     */
    private static void basedOnParentElementIdentifyItsAnyAChildElement()
    {
        oBrowser.findElement(By.xpath("//table[@id='tbl1']/descendant::tr[4]/td[6]/input")).sendKeys("24000");
    }
}
