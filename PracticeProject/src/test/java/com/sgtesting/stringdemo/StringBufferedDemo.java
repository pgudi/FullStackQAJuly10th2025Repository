package com.sgtesting.stringdemo;

public class StringBufferedDemo {
    public static void main(String[] args) {
        appendDemo();
        insertString();
        deleteString();
        reverseString();
    }

    private static void appendDemo()
    {
        StringBuffer s=new StringBuffer("Java");
        System.out.println(s);
        s.append(" Programming");
        System.out.println(s);
        System.out.println("++++++++++++++++++++");
    }

    private static void insertString()
    {
        StringBuffer s=new StringBuffer("It is a palace");
        StringBuffer str=s.insert(8,"new ");
        System.out.println("Insert result:"+str);
        System.out.println("++++++++++++++++++++");
    }

    private static void deleteString()
    {
        StringBuffer s=new StringBuffer("It is a new palace");
        StringBuffer str=s.delete(8,12);
        System.out.println("Delete result:"+str);
        System.out.println("++++++++++++++++++++");
    }

    private static void reverseString()
    {
        StringBuffer s=new StringBuffer("Programming");
        StringBuffer str=s.reverse();
        System.out.println("Reverse result:"+str);
        System.out.println("++++++++++++++++++++");
    }
}
