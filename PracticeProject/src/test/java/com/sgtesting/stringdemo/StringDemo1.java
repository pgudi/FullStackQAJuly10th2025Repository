package com.sgtesting.stringdemo;
public class StringDemo1 {
    public static void main(String[] args) {
        lowercase();
        uppercase();
        strLength();
        emptyStr();
        getCharacterByIncex();
        compareString1();
        compareString2();
        existanceOfString();
        findPosition();
        convertToString();
        splitString();
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

    private static void compareString1()
    {
        String s1="JavaScript";
        String s2="JAVASCRIPT";

        boolean v1=s1.equals(s2);
        System.out.println("whether s1 and s2 and eaqul :"+v1);
        boolean v2=s1.equalsIgnoreCase(s2);
        System.out.println("whether s1 and s2 and eaqul :"+v2);
        System.out.println("+++++++++++++++++++++");
    }

    private static void compareString2()
    {
        String s1="JavaScript";
        String s2="JAVASCRIPT";

        int v1=s1.compareTo(s2);
        System.out.println("whether s1 and s2 and eaqul :"+v1);
        int v2=s1.compareToIgnoreCase(s2);
        System.out.println("whether s1 and s2 and eaqul :"+v2);
        System.out.println("+++++++++++++++++++++");
    }

    private static void existanceOfString()
    {
        String s="Bangalore is capital city of Karnataka";
        boolean v1=s.startsWith("Bangalore");
        System.out.println("Starts With 'Bangalore' "+v1);
        boolean v2=s.endsWith("Karnataka");
        System.out.println("Ends With 'Karnataka' "+v2);
        boolean v3=s.contains("capital");
        System.out.println("Contains 'capital' "+v3);
        System.out.println("+++++++++++++++++++++");
    }

    private static void showCharacters()
    {
        String s=new String("WELCOME");
        char ch[]=s.toCharArray();
        for(char kk:ch)
        {
            System.out.println(kk);
        }
        System.out.println("+++++++++++++++++++++");
    }

    private static void findPosition()
    {
        String s="It is a book, It is on table";
        int v1=s.indexOf("is");
        System.out.println("Position of 'is; from Left "+v1);
        int v2=s.lastIndexOf("is");
        System.out.println("Position of 'is; from Right "+v2);
        System.out.println("+++++++++++++++++++++");
    }


    private static void convertToString()
    {
        double d=45.75;
        String s1=String.valueOf(d);
        System.out.println(" String Convertion :"+s1);
        boolean b2=true;
        String s2=String.valueOf(b2);
        System.out.println(" String Convertion :"+s2);
        System.out.println("+++++++++++++++++++++");
    }

    private static void splitString()
    {
        String s="Apple,Mango,Banana,Orange,Grapes";
        String str[]=s.split(",");
        for(String k:str)
        {
            System.out.println(k);
        }
        System.out.println("+++++++++++++++++++++");
    }
}
