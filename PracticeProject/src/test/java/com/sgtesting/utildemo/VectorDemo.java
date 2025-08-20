package com.sgtesting.utildemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
    //    addElements();
    //    removeElements();
    //    readElements1();
    //    readElements2();
    //    readElementsByIterator();
    //    readElementsByEnumeration();
        withOutGenerics();
    }

    private static void addElements()
    {
        Vector<String> obj=new Vector<String>();
        System.out.println("Elements :"+obj);
        obj.add("Banana");
        obj.add("Mango");
        obj.add("Orange");
        obj.add(1,"Grapes");
        obj.add("Apple");
        obj.add("Kiwi");
        obj.add("Mango");
        System.out.println("Elements :"+obj);
        Vector<String> obj1=new Vector<String>();
        obj1.add("Blue");
        obj1.add("Red");
        obj1.add("Green");
        obj.addAll(obj1);
        System.out.println("Elements :"+obj);
    }

    private static void removeElements()
    {
        Vector<String> obj=new Vector<String>();
        System.out.println("Elements :"+obj);
        obj.add("Banana");
        obj.add("Mango");
        obj.add("Orange");
        obj.add(1,"Grapes");
        obj.add("Apple");
        obj.add("Kiwi");
        obj.add("Watermelon");
        System.out.println("Elements :"+obj);
        obj.remove("Mango");
        System.out.println("Elements :"+obj);
        obj.remove(4);
        System.out.println("Elements :"+obj);
        obj.removeAll(obj);
        System.out.println("Elements :"+obj);
    }

    private static void readElements1()
    {
        Vector<String> obj=new Vector<String>();
        System.out.println("Elements :"+obj);
        obj.add("Banana");
        obj.add("Mango");
        obj.add("Orange");
        obj.add("Grapes");
        obj.add("Apple");
        obj.add("Kiwi");
        obj.add("Watermelon");
        System.out.println("Elements :"+obj);
        for(String val : obj)
        {
            System.out.println(val);
        }
    }

    private static void readElements2()
    {
        Vector<String> obj=new Vector<String>();
        System.out.println("Elements :"+obj);
        obj.add("Banana");
        obj.add("Mango");
        obj.add("Orange");
        obj.add("Grapes");
        obj.add("Apple");
        obj.add("Kiwi");
        obj.add("Watermelon");
        System.out.println("Elements :"+obj);
        for(int i=0;i<obj.size();i++)
        {
            System.out.println(obj.get(i));
        }
    }

    private static void readElementsByIterator()
    {
        Vector<String> obj=new Vector<String>();
        System.out.println("Elements :"+obj);
        obj.add("Banana");
        obj.add("Mango");
        obj.add("Orange");
        obj.add("Grapes");
        obj.add("Apple");
        obj.add("Kiwi");
        obj.add("Watermelon");
        System.out.println("Elements :"+obj);
        Iterator<String> itr =obj.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }

    private static void readElementsByEnumeration()
    {
        Vector<String> obj=new Vector<String>();
        System.out.println("Elements :"+obj);
        obj.add("Banana");
        obj.add("Mango");
        obj.add("Orange");
        obj.add("Grapes");
        obj.add("Apple");
        obj.add("Kiwi");
        obj.add("Watermelon");
        System.out.println("Elements :"+obj);
        Enumeration<String> enumr =obj.elements();
        while(enumr.hasMoreElements())
        {
            System.out.println(enumr.nextElement());
        }
    }

    private static void withOutGenerics()
    {
        Vector obj=new Vector();
        System.out.println("Elements :"+obj);
        obj.add(45);
        obj.add(10.75);
        obj.add(true);
        obj.add("Apple");
        obj.add('N');
        System.out.println("Elements :"+obj);
    }
}
