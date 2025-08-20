package com.sgtesting.utildemo;
class Demo
{
    public static <E> void readElements(E[] elements)
    {
        for(E element: elements)
        {
            System.out.println(element);
        }
    }
}
public class GenericsElementsDemo {
    public static void main(String[] args) {
        Integer[] a={10,20,30,40};
        Demo.readElements(a);
        System.out.println("++++++++++++++++++");
        Character ch[]={'J','A','V','A'};
        Demo.readElements(ch);
        System.out.println("++++++++++++++++++");
        Double d[]={5.25, 10.125, 20.75};
        Demo.readElements(d);
    }
}
