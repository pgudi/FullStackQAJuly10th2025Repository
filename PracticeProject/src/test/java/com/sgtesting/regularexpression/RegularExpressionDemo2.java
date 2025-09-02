package com.sgtesting.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo2 {
    public static void main(String[] args) {
    //    existanceDemo();
    //    replaceDemo1();
    //    wordCount();
    //    sumOfIntegers();
        concatenateChars();
    }

    private static void existanceDemo()
    {
        Pattern pattern=Pattern.compile("[0-9][0-9][0-9]");
        String str="Bangalore received 125 mili meter of rain yesterday";
        Matcher matcher=pattern.matcher(str);
        boolean val=matcher.find();
        System.out.println(val);
    }

    private static void replaceDemo1()
    {
        Pattern pattern=Pattern.compile("[0-9]{3}");
        String str="Bangalore received 125 mili meter of rain yesterday";
        Matcher matcher=pattern.matcher(str);
        String s=matcher.replaceAll("many");
        System.out.println(s);
    }

    private static void wordCount()
    {
        Pattern pattern=Pattern.compile("[A-Za-z]+");
        String str="The temple is at the top of the hill";
        Matcher matcher=pattern.matcher(str);
        int count=0;
        while(matcher.find())
        {
            count=count+1;
        }
        System.out.println("# of Word Count :"+count);
    }

    private static void sumOfIntegers()
    {
        Pattern pattern=Pattern.compile("[0-9]+");
        String str="It12is5an7old15palace";
        Matcher matcher=pattern.matcher(str);
        int sum=0;
        while(matcher.find())
        {
            int v1=Integer.parseInt(matcher.group());
            sum=sum+v1;
        }
        System.out.println("Sum of All Digits:"+sum);
    }

    private static void concatenateChars()
    {
        Pattern pattern=Pattern.compile("[A-Za-z]+");
        String str="It12is5an7old15palace";
        Matcher matcher=pattern.matcher(str);
        String result="";
        while(matcher.find())
        {
            result=result+matcher.group()+" ";
        }
        System.out.println(result);
    }
}
