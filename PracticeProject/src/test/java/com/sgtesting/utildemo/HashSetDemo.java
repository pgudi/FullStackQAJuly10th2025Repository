package com.sgtesting.utildemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
    //    addElements();
    //    removeElements();
    //    readElements1();
    //    readElementsByIterator();
        withOutGenerics();
    }

    private static void addElements()
    {
        HashSet<String> obj=new HashSet<String>();
        System.out.println("Elements :"+obj);
        obj.add("Banana");
        obj.add("Mango");
        obj.add("Orange");
        obj.add("Grapes");
        obj.add("Apple");
        obj.add("Kiwi");
        obj.add("Mango");
        System.out.println("Elements :"+obj);
        HashSet<String> obj1=new HashSet<String>();
        obj1.add("Blue");
        obj1.add("Red");
        obj1.add("Green");
        obj.addAll(obj1);
        System.out.println("Elements :"+obj);
    }

    private static void removeElements()
    {
        HashSet<String> obj=new HashSet<String>();
        System.out.println("Elements :"+obj);
        obj.add("Banana");
        obj.add("Pineapple");
        obj.add("Orange");
        obj.add("Grapes");
        obj.add("Apple");
        obj.add("Kiwi");
        obj.add("Mango");
        System.out.println("Elements :"+obj);
        obj.remove("Grapes");
        System.out.println("Elements :"+obj);
        obj.removeAll(obj);
        System.out.println("Elements :"+obj);
    }

    private static void readElements1()
    {
        HashSet<String> obj=new HashSet<String>();
        System.out.println("Elements :"+obj);
        obj.add("Banana");
        obj.add("Pineapple");
        obj.add("Orange");
        obj.add("Grapes");
        obj.add("Apple");
        obj.add("Kiwi");
        obj.add("Mango");
        System.out.println("Elements :"+obj);
        for(String str:obj)
        {
            System.out.println(str);
        }
    }

    private static void readElementsByIterator()
    {
        HashSet<String> obj=new HashSet<String>();
        System.out.println("Elements :"+obj);
        obj.add("Banana");
        obj.add("Pineapple");
        obj.add("Orange");
        obj.add("Grapes");
        obj.add("Apple");
        obj.add("Kiwi");
        obj.add("Mango");
        System.out.println("Elements :"+obj);
        Iterator<String> iter =obj.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }

    private static void withOutGenerics()
    {
        HashSet obj=new HashSet();
        System.out.println("Elements :"+obj);
        obj.add(45);
        obj.add(10.75);
        obj.add(true);
        obj.add("Apple");
        obj.add('N');
        System.out.println("Elements :"+obj);
    }
}
