package com.sgtesting.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {
    public static void main(String[] args) {
    //    matches();
    //    finDemo();
    //    countOfMatches();
    //    displayMatches();
    //    replaceMatches();
        splitDemo();
    }

    private static void matches()
    {
        Pattern pattern=Pattern.compile("Playwright");
        Matcher matcher=pattern.matcher("Playwright");
        boolean val=matcher.matches();
        System.out.println(val);
    }

    private static void finDemo()
    {
        Pattern pattern=Pattern.compile("Playwright");
        Matcher matcher=pattern.matcher("Playwright Selenium Playwright Cypress");
        boolean val=matcher.find();
        System.out.println(val);
    }

    private static void countOfMatches()
    {
        Pattern pattern=Pattern.compile("Playwright");
        Matcher matcher=pattern.matcher("Playwright Selenium Playwright Cypress");
        int count=0;
        while(matcher.find())
        {
            count=count+1;
        }
        System.out.println("# of Occurance:"+count);
    }

    private static void displayMatches()
    {
        Pattern pattern=Pattern.compile("Playwright");
        Matcher matcher=pattern.matcher("Playwright Selenium Playwright Cypress");

        while(matcher.find())
        {
            System.out.println(matcher.group());
        }

    }

    private static void replaceMatches()
    {
        Pattern pattern=Pattern.compile("Playwright");
        Matcher matcher=pattern.matcher("Playwright Selenium Playwright Cypress");

        String str=matcher.replaceAll("Katalon");
        System.out.println(str);
    }

    private static void splitDemo()
    {
        Pattern pattern=Pattern.compile(",");
        String str[]=pattern.split("Playwright,Selenium,Katalon,Cypress");
        for(String s:str)
        {
            System.out.println(s);
        }
    }
}
