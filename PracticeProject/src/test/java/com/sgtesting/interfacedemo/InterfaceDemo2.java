package com.sgtesting.interfacedemo;
interface University
{
    default void showName(String name)
    {
        System.out.println("University Name :"+name);
    }
}

interface College
{
    default void showName(String name)
    {
        System.out.println("College Name :"+name);
    }
}

class LVDCollege implements University,College
{

    @Override
    public void showName(String name) {
        College.super.showName(name);
    }
}

public class InterfaceDemo2 {
    public static void main(String[] args) {
        LVDCollege o=new LVDCollege();
        o.showName("SLN Engineering");
    }
}
