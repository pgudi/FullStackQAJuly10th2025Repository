package com.sgtesting.serializationdemo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {
    public static void main(String[] args) {
        readObjectFromFile();
    }

    private static void readObjectFromFile()
    {
        FileInputStream fin=null;
        ObjectInputStream in=null;
        Employee obj=null;
        try
        {
            fin=new FileInputStream("D:\\Demo\\Test\\Employee.ser");
            in=new ObjectInputStream(fin);

            obj=(Employee) in.readObject();

            obj.showEmployeeName();
            obj.showJobName();
            obj.showSalary();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fin.close();
                in.close();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
