package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CssSeelctorDemo {
    private static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
    //    absoluteCSSPath();
    //    relativeCSSPath();
    //    relativeCSSWithTagNameAndIdAttributeValue();
    //    relativeCSSWithIdAttributeValueAlone();
    //    relativeCSSWithTagNameAndClassAttributeValue();
    //    relativeCSSWithClassAttributeValueAlone();
    //    relativeCSSWithTagNameAndAttributeNameValue();
    //    relativeCSSWithTagNameAndMultipleAttributeNameValue();
    //    relativeCSSWithTagNameAndPartialAttributeValue();
    //    relativeCSSWithNthChildConcept();
    //    relativeCSSWithSiblingConcept();
    //    relativeCSSWithTagNameAndAttributeName();
    //    relativeCSSWithTagNameAndAttributeName_01();
    //    relativeCSSWithTagNameAndAttributeName_02();
        relativeCSSWithTagNameAndAttributeName_03();
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
            oBrowser.get("file:///D:/HTML/Sample.html");
            Thread.sleep(4000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void absoluteCSSPath()
    {
        oBrowser.findElement(By.cssSelector("html body div form input")).sendKeys("DemoUser1");
    }

    /**
     * case 1 : identify Element using tagName
     */
    private static void relativeCSSPath()
    {
        oBrowser.findElement(By.cssSelector("input")).sendKeys("DemoUser1");
    }

    /**
     * case 2 : identify Element using tagName with id attribute value
     */
    private static void relativeCSSWithTagNameAndIdAttributeValue()
    {
        oBrowser.findElement(By.cssSelector("input#pwd1pass1word1")).sendKeys("DemoUser1");
    }

    /**
     * case 3 : identify Element using id attribute value alone
     */
    private static void relativeCSSWithIdAttributeValueAlone()
    {
        oBrowser.findElement(By.cssSelector("#pwd1pass1word1")).sendKeys("DemoUser1");
    }

    /**
     * case 4 : identify Element using tagName with class attribute value
     */
    private static void relativeCSSWithTagNameAndClassAttributeValue()
    {
        oBrowser.findElement(By.cssSelector("input.pass1word1")).sendKeys("DemoUser1");
    }

    /**
     * case 5 : identify Element using class attribute value alone
     */
    private static void relativeCSSWithClassAttributeValueAlone()
    {
        oBrowser.findElement(By.cssSelector(".pass1word1")).sendKeys("DemoUser1");
    }

    /**
     * case 6 : identify Element using tagName With Attribute Name and Value
     * syntax: <tagName>[attributeName=attributeValue]
     */
    private static void relativeCSSWithTagNameAndAttributeNameValue()
    {
        oBrowser.findElement(By.cssSelector("input[value='Submit']")).click();
    }

    /**
     * case 7 : identify Element using tagName With Multiple  Attribute Name and Value
     * syntax: <tagName>[attributeName=attributeValue]
     */
    private static void relativeCSSWithTagNameAndMultipleAttributeNameValue()
    {
        oBrowser.findElement(By.cssSelector("input[type='button'][value='Submit']")).click();
    }

    /**
     * case 8 : identify Element using tagName With Partial Attribute Value
     *
     * syntax: <tagName>[attributeName ^= attributeValue] // starts-with
     * syntax: <tagName>[attributeName $= attributeValue] // ends-with
     * syntax: <tagName>[attributeName *= attributeValue] // contains
     */
    private static void relativeCSSWithTagNameAndPartialAttributeValue()
    {
        //starts-with
     //   oBrowser.findElement(By.cssSelector("input[id ^= 'btn1']")).click();
        //contains
        oBrowser.findElement(By.cssSelector("input[id *= 'submit1']")).click();
    }

    /**
     * case 9 : identify Element using nth-child concept
     * syntax: <tagName>[attributeName=attributeValue]
     */
    private static void relativeCSSWithNthChildConcept()
    {
        oBrowser.findElement(By.cssSelector("form#frm3 > :nth-child(1)")).sendKeys("DemoUser1");
        oBrowser.findElement(By.cssSelector("form#frm3 > :nth-child(5)")).sendKeys("DemoUser5");
        oBrowser.findElement(By.cssSelector("form#frm3 > :nth-child(10)")).sendKeys("DemoUser10");
    }

    /**
     * case 10 : identify Element using sibling concept
     * syntax: <tagName> + <tagName> + <tagName>
     */
    private static void relativeCSSWithSiblingConcept()
    {
        oBrowser.findElement(By.cssSelector("#frm3 > input + input + input")).sendKeys("DemoUser3");
    }

    /**
     * case 11 : identify Element using TagName and AttributeName alone
     * syntax: <tagName>[Attributename]
     */
    private static void relativeCSSWithTagNameAndAttributeName()
    {
        // Number of Links available in a Web Page
        List<WebElement> oLinks=oBrowser.findElements(By.cssSelector("a[href"));
        System.out.println("# of Links :"+oLinks.size());
    }

    private static void relativeCSSWithTagNameAndAttributeName_01()
    {
        // Display All available Link Names in a Web Page
        List<WebElement> oLinks=oBrowser.findElements(By.cssSelector("a[href"));
        for(int i=0;i<oLinks.size();i++)
        {
            WebElement link=oLinks.get(i);
            System.out.println(link.getText());
        }
    }

    private static void relativeCSSWithTagNameAndAttributeName_02()
    {
        // Display All available Link Names in a Web Page
        List<WebElement> oLinks=oBrowser.findElements(By.cssSelector("a[href"));
        for(int i=0;i<oLinks.size();i++)
        {
            WebElement link=oLinks.get(i);
            String linkname=link.getText();
            if(linkname.contains("Apache"))
            {
                link.click();
                break;
            }
        }
    }

    private static void relativeCSSWithTagNameAndAttributeName_03()
    {
        // org.openqa.selenium.StaleElementReferenceException:
        // stale element reference: stale element not found
        List<WebElement> oLinks=oBrowser.findElements(By.cssSelector("a[href"));
        for(int i=0;i<oLinks.size();i++)
        {
            WebElement link=oLinks.get(i);
            String linkname=link.getText();
            if(linkname.contains("Apache"))
            {
                link.click();
            }
        }
    }
}
