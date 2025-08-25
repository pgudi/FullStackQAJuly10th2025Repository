package com.sgtesting.utildemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) {
    //    writeContent();
        readContent();
    }

    private static void writeContent()
    {
        FileOutputStream fout=null;
        Properties prop=null;
        try
        {
            fout=new FileOutputStream("D:\\Demo\\Test\\Details.properties");
            prop=new Properties();

            prop.setProperty("username","admin");
            prop.setProperty("password","manager");
            prop.setProperty("pin","1234");

            prop.store(fout, "It is for Testing purpose");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fout.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    private static void readContent()
    {
        FileInputStream fin=null;
        Properties prop=null;
        try
        {
            fin=new FileInputStream("D:\\Demo\\Test\\Details.properties");
            prop=new Properties();

            prop.load(fin);

            System.out.println(prop.getProperty("username"));
            System.out.println(prop.getProperty("password"));
            System.out.println(prop.getProperty("pin"));
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fin.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
