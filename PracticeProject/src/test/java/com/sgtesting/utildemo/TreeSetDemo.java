package com.sgtesting.utildemo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
    //    addElements();
    //    removeElements();
    //    readElements();
        readElementsByIterator();
    }

    private static void addElements()
    {
        TreeSet<String> obj=new TreeSet<String>();
        System.out.println("Elements :"+obj);
        obj.add("Banana");
        obj.add("Mango");
        obj.add("Orange");
        obj.add("Grapes");
        obj.add("Apple");
        obj.add("Kiwi");
        obj.add("Mango");
        System.out.println("Elements :"+obj);
        TreeSet<String> obj1=new TreeSet<String>();
        obj1.add("Blue");
        obj1.add("Red");
        obj1.add("Green");
        obj.addAll(obj1);
        System.out.println("Elements :"+obj);
    }

    private static void removeElements()
    {
        TreeSet<String> obj=new TreeSet<String>();
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

    private static void readElements()
    {
        TreeSet<String> obj=new TreeSet<String>();
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
        TreeSet<String> obj=new TreeSet<String>();
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
}
