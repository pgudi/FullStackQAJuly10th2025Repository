package com.sgtesting.utildemo;

public class WrapperClassDemo1 {
    public static void main(String[] args) {
    //    autoBoxingDemo();
        unBoxingDemo();
    }

    private static void autoBoxingDemo()
    {
        int a=35;
        System.out.println("int a:"+a);
        Integer b=Integer.valueOf(a);
        System.out.println("Integer b:"+b);
        //Autoboxing
        Integer c=a;
        System.out.println("Integer c:"+c);
    }

    private static void unBoxingDemo()
    {
        Integer a=new Integer(125);
        System.out.println("Integer a :"+a);
        int b=a.intValue();
        System.out.println("int b :"+b);
        //Unboxing
        int c=a;
        System.out.println("int c:"+c);
    }
}
