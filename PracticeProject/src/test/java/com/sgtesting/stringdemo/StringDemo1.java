package com.sgtesting.stringdemo;
public class StringDemo1 {
    public static void main(String[] args) {
        lowercase();
        uppercase();
        strLength();
        emptyStr();
        getCharacterByIncex();
    }

    private static void lowercase()
    {
        String s="WELCOME";
        String s1=s.toLowerCase();
        System.out.println("Lowercase :"+s1);
        System.out.println("+++++++++++++++++++++");
    }

    private static void uppercase()
    {
        String s="welcome";
        String s1=s.toUpperCase();
        System.out.println("Uppercase :"+s1);
        System.out.println("+++++++++++++++++++++");
    }

    private static void strLength()
    {
        String s="welcome";
        int v1=s.length();
        System.out.println("# of characters :"+v1);
        System.out.println("+++++++++++++++++++++");
    }

    private static void emptyStr()
    {
        String s=new String();
        boolean v1=s.isEmpty();
        System.out.println("Emptry String :"+v1);
        System.out.println("+++++++++++++++++++++");
    }

    private static void getCharacterByIncex()
    {
        String s="WELCOME";
        char ch=s.charAt(6);
        System.out.println("The Extracted character :"+ch);
        System.out.println("+++++++++++++++++++++");
    }

}
