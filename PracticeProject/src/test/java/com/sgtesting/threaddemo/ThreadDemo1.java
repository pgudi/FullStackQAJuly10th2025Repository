package com.sgtesting.threaddemo;
class MyClass1 implements Runnable
{

    @Override
    public void run() {
        showEvenNumbers();
    }

    synchronized public void showEvenNumbers()
    {
        try
        {
            for(int i=20;i<=40;i++)
            {
                Thread.sleep(1000);
                if(i % 2==0)
                {
                    System.out.println(Thread.currentThread().getName()+" Displays Even Number :"+i);
                }
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
public class ThreadDemo1 {
    public static void main(String[] args) {
        MyClass1 obj=new MyClass1();

        Thread t1=new Thread(obj);
        t1.setName("Alpha");
        t1.start();

        Thread t2=new Thread(obj);
        t2.setName("Omega");
        t2.start();
    }
}
