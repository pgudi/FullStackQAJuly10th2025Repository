package com.sgtesting.iodemo;

import java.io.FileWriter;

public class FileWriterDemo {
    public static void main(String[] args) {
        writeContent();
    }

    private static void writeContent()
    {
        FileWriter fw=null;
        try
        {
            fw=new FileWriter("D:\\Demo\\Test\\Welcome2.txt",true);

            String str="Bangalore is a garden city,";
            str+="It is capital city of Karnataka.";

            char ch[]=str.toCharArray();
            fw.write(ch);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fw.close();

            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
