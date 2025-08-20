package com.sgtesting.utildemo;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
    //    addElements();
    //    removeElements();
    //    readElements1();
    //    readElements2();
    //    readElementsByIterator();
    //    readElementsByListIterator();
    //    withOutGenerics();
          queueDemo();
    }

    private static void addElements()
    {
        List<String> obj=new LinkedList<String>();
        System.out.println("Elements :"+obj);
        obj.add("Banana");
        obj.add("Mango");
        obj.add("Orange");
        obj.add(1,"Grapes");
        obj.add("Apple");
        obj.add("Kiwi");
        obj.add("Mango");
        System.out.println("Elements :"+obj);
        List<String> obj1=new LinkedList<String>();
        obj1.add("Blue");
        obj1.add("Red");
        obj1.add("Green");
        obj.addAll(obj1);
        System.out.println("Elements :"+obj);
    }

    private static void removeElements()
    {
        List<String> obj=new LinkedList<String>();
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
        List<String> obj=new LinkedList<String>();
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
        List<String> obj=new LinkedList<String>();
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
        List<String> obj=new LinkedList<String>();
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

    private static void readElementsByListIterator()
    {
        List<String> obj=new LinkedList<String>();
        System.out.println("Elements :"+obj);
        obj.add("Banana");
        obj.add("Mango");
        obj.add("Orange");
        obj.add("Grapes");
        obj.add("Apple");
        obj.add("Kiwi");
        obj.add("Watermelon");
        System.out.println("Elements :"+obj);
        System.out.println("Forward Direction");
        ListIterator<String> itr =obj.listIterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("Backward Direction");
        while(itr.hasPrevious())
        {
            System.out.println(itr.previous());
        }
    }

    private static void withOutGenerics()
    {
        List obj=new LinkedList();
        System.out.println("Elements :"+obj);
        obj.add(45);
        obj.add(10.75);
        obj.add(true);
        obj.add("Apple");
        obj.add('N');
        System.out.println("Elements :"+obj);
    }

    private static void queueDemo()
    {
        Queue<Integer> obj=new LinkedList<Integer>();
        System.out.println("Elements :"+obj);
        obj.add(100);
        obj.add(200);
        obj.add(300);
        obj.add(400);
        obj.add(500);
        System.out.println("Elements :"+obj);
        obj.remove();
        System.out.println("Elements :"+obj);
        obj.remove();
        System.out.println("Elements :"+obj);
    }
}
