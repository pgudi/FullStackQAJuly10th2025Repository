package com.sgtesting.singleton;
class Maths
{
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
}
public class BeforeAplyingSingleton {
    public static void main(String[] args) {
        Maths o1=new Maths();
        o1.addition(20,40);
        o1.multiplication(15,9);

        Maths o2=new Maths();
        o2.addition(100,40);
        o2.multiplication(10,13);

        Maths o3=new Maths();
        o3.addition(30,60);
        o3.multiplication(11,15);
    }
}
