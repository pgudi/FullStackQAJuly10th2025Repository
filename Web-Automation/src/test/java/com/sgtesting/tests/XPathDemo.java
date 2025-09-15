package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XPathDemo {
    private static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
    //    absoluteXPath();
    //    relativeXPathBasedOnTagName();
    //    relativeXPathBasedOnTagNameWithIndex();
    //    relativeXPathBasedOnTagNameWithAttributeNameValue();
    //    relativeXPathBasedOnAttributeNameValue();
    //    relativeXPathBasedOnAttributeValue();
    //    relativeXPathBasedOnMultipleAttributeValue();
    //    relativeXPathBasedOnMultipleAttributeValueUsingOR();
    //    relativeXPathBasedOnMultipleAttributeValueUsingand();
    //    relativeXPathBasedOnTagNameWithPartialMatchingOfAttributeValue();
    //    relativeXPathBasedOnTextContent();
    //    relativeXPathBasedOnPartialMatchingOfTextContent();
    //    relativeXPathBasedOnTagNameWithAttributeName();
    //    relativeXPathBasedOnTagNameWithAttributeName_01();
    //    relativeXPathBasedOnTagNameWithAttributeName_02();
        relativeXPathBasedOnTagNameWithAttributeName_03();
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

    private static void absoluteXPath()
    {
        oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("DemoUser1");
    }

    /**
     *  case 1: based on tagName identify the Element
     *  syntax: //<tagName>
     */
    private static void relativeXPathBasedOnTagName()
    {
        oBrowser.findElement(By.xpath("//input")).sendKeys("DemoUser1");
    }

    /**
     *  case 2: based on tagName with index identify the Element
     *  syntax: //<tagName>[index]
     */
    private static void relativeXPathBasedOnTagNameWithIndex()
    {
        oBrowser.findElement(By.xpath("//input[2]")).sendKeys("DemoUser1");
    }

    /**
     *  case 3: based on tagName with attributename and value
     *  syntax: //<tagName>[@attributeName=value]
     */
    private static void relativeXPathBasedOnTagNameWithAttributeNameValue()
    {
        oBrowser.findElement(By.xpath("//input[@value='Submit']")).click();
    }

    /**
     *  case 4: based on attributename and value
     *  syntax: //*[@attributeName=value]
     */
    private static void relativeXPathBasedOnAttributeNameValue()
    {
        oBrowser.findElement(By.xpath("//*[@value='Submit']")).click();
    }

    /**
     *  case 5: based on attribute value
     *  syntax: //*[@*=value]
     */
    private static void relativeXPathBasedOnAttributeValue()
    {
        oBrowser.findElement(By.xpath("//*[@*='Submit']")).click();
    }

    /**
     *  case 6: based on Multiple attribute Name and value
     *  syntax: //<tagName>[@attributeName1=value][@attributeName2=value]
     */
    private static void relativeXPathBasedOnMultipleAttributeValue()
    {
        oBrowser.findElement(By.xpath("//input[@type='button'][@value='Submit']")).click();
    }

    /**
     *  case 7: based on Multiple attribute Name and value using OR Operator
     *  syntax: //<tagName>[@attributeName1=value or @attributeName2=value]
     */
    private static void relativeXPathBasedOnMultipleAttributeValueUsingOR()
    {
        oBrowser.findElement(By.xpath("//input[@type='button' or @value='Submit']")).click();
    }

    /**
     *  case 8: based on Multiple attribute Name and value using and Operator
     *  syntax: //<tagName>[@attributeName1=value and @attributeName2=value]
     */
    private static void relativeXPathBasedOnMultipleAttributeValueUsingand()
    {
        oBrowser.findElement(By.xpath("//input[@type='button' and @value='Submit']")).click();
    }

    /**
     *  case 9: based on tagName with attributename and Partial attribute value
     *  starts-with(@attributeName,'attributeValue')
     *  ends-with(@attributeName,'attributeValue')
     *  contains(@attributeName,'attributeValue')
     *  syntax: //<tagName>[starts-with(@attributeName,'attributeValue')]
     *  syntax: //<tagName>[ends-with(@attributeName,'attributeValue')]
     *  syntax: //<tagName>[contains(@attributeName,'attributeValue')]
     */
    private static void relativeXPathBasedOnTagNameWithPartialMatchingOfAttributeValue()
    {
     //   oBrowser.findElement(By.xpath("//input[starts-with(@id,'btn1')]")).click();
     //   oBrowser.findElement(By.xpath("//input[contains(@id,'submit1')]")).click();
     //   oBrowser.findElement(By.xpath("//input[ends-with(@id,'button1')]")).click();
    }

    /**
     *  case 10: based on exact matching of Text Content
     *  syntax: //<tagName>[text()='content']
     */
    private static void relativeXPathBasedOnTextContent()
    {
        oBrowser.findElement(By.xpath("//a[text()='S G Software Testing']")).click();
    }

    /**
     *  case 11: based on Partial matching of Text Content
     *  starts-with(text(),'partialContent')
     *  ends-with(text(),'partialContent')
     *  contains(text(),'partialContent')
     *  syntax: //<tagName>[starts-with(text(),'partialContent')]
     *  syntax: //<tagName>[ends-with(text(),'partialContent')]
     *  syntax: //<tagName>[contains(text(),'partialContent')]
     */
    private static void relativeXPathBasedOnPartialMatchingOfTextContent()
    {
     //   oBrowser.findElement(By.xpath("//a[starts-with(text(),'S G')]")).click();
        oBrowser.findElement(By.xpath("//a[contains(text(),'Software')]")).click();
    }

    /**
     *  case 12: based on tagName with attributename
     *  syntax: //<tagName>[@attributeName]
     */
    private static void relativeXPathBasedOnTagNameWithAttributeName()
    {
        //Find Number of Links in the Web Page
        List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
        System.out.println("# of Links :"+oLinks.size());
    }

    private static void relativeXPathBasedOnTagNameWithAttributeName_01()
    {
        //Display All Link Names in the Web Page
        List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
        for(int i=0;i<oLinks.size();i++)
        {
            WebElement link=oLinks.get(i);
            String linkName=link.getText();
            System.out.println(linkName);
        }
    }

    private static void relativeXPathBasedOnTagNameWithAttributeName_02()
    {
        //Display All Link Names in the Web Page
        List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
        for(int i=0;i<oLinks.size();i++)
        {
            WebElement link=oLinks.get(i);
            String linkName=link.getText();
            if(linkName.endsWith("Testing")){
                link.click();;
                break;
            }
        }
    }

    private static void relativeXPathBasedOnTagNameWithAttributeName_03()
    {
        //org.openqa.selenium.StaleElementReferenceException:
        // stale element reference: stale element not found
        List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
        for(int i=0;i<oLinks.size();i++)
        {
            WebElement link=oLinks.get(i);
            String linkName=link.getText();
            if(linkName.endsWith("Apache")){
                link.click();;
            }
        }
    }
}
