package com.sgtesting.singleton;
class Maths1
{
    static Maths1 obj=null;
    private Maths1()
    {
        // it is private constructor
    }
    void addition(int x,int y)
    {
        int result=(x+y);
        System.out.println("Addition Result:"+result);
    }

    void multiplication(int x,int y)
    {
        int result=(x * y);
        System.out.println("Multiplication Result:"+result);
    }

    public static Maths1 getInstance()
    {
        if(obj==null)
        {
            obj=new Maths1();
        }
        return obj;
    }
}
public class AfterAplyingSingleton {
    public static void main(String[] args) {
        Maths1 o1=Maths1.getInstance();
        o1.addition(20,40);
        o1.multiplication(15,9);

        Maths1 o2=Maths1.getInstance();
        o2.addition(100,40);
        o2.multiplication(10,13);

        Maths1 o3=Maths1.getInstance();
        o3.addition(30,60);
        o3.multiplication(11,15);

        if(o1==o2 && o2==o3)
        {
            System.out.println("Singleton Design Pattern has achieved!!!");
        }
        else
        {
            System.out.println("Singleton Design Pattern has not achieved!!!");
        }
    }
}
