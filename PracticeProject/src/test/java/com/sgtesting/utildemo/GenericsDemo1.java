package com.sgtesting.utildemo;
class Sample<T>
{
    T obj;
    void add(T obj)
    {
        this.obj=obj;
    }

    T get()
    {
        return this.obj;
    }

}
public class GenericsDemo1 {
    public static void main(String[] args) {
       //With Generics Approach:
       Sample<Integer> o1=new  Sample<Integer>();
       o1.add(100);
       int v1=o1.get();
       System.out.println(v1);

       o1.add(200);
       int v2=o1.get();
       System.out.println(v2);

       Sample<String> o2=new Sample<String>();
       o2.add("Mango");
       String s1=o2.get();
       System.out.println(s1);
       o2.add("Orange");
       String s2=o2.get();
       System.out.println(s2);

       //Without Generics
        Sample o3=new Sample();
        o3.add(55);
        int a1=(int) o3.get();
        System.out.println(a1);
        o3.add(100.75);
        double d1=(double) o3.get();
        System.out.println(d1);
    }
}
