package com.sgtesting.stringdemo;

public class StringBuilderDemo {
    public static void main(String[] args) {
        appendDemo();
        insertString();
        deleteString();
        reverseString();
    }

    private static void appendDemo()
    {
        StringBuilder s=new StringBuilder("Java");
        System.out.println(s);
        s.append(" Programming");
        System.out.println(s);
        System.out.println("++++++++++++++++++++");
    }

    private static void insertString()
    {
        StringBuilder s=new StringBuilder("It is a palace");
        StringBuilder str=s.insert(8,"new ");
        System.out.println("Insert result:"+str);
        System.out.println("++++++++++++++++++++");
    }

    private static void deleteString()
    {
        StringBuilder s=new StringBuilder("It is a new palace");
        StringBuilder str=s.delete(8,12);
        System.out.println("Delete result:"+str);
        System.out.println("++++++++++++++++++++");
    }

    private static void reverseString()
    {
        StringBuilder s=new StringBuilder("Programming");
        StringBuilder str=s.reverse();
        System.out.println("Reverse result:"+str);
        System.out.println("++++++++++++++++++++");
    }
}
