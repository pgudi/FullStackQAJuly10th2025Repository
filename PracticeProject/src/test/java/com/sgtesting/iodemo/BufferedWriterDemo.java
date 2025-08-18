package com.sgtesting.iodemo;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        writeContent();
    }

    private static void writeContent()
    {
        BufferedWriter bw=null;
        try
        {
            bw=new BufferedWriter(new FileWriter("D:\\Demo\\Test\\Welcome3.txt",true));
            bw.write("Welcome to City Bangalore in Karnataka.");
            bw.newLine();
            bw.write("It is called as Garden City of Karnataka");
            bw.newLine();
            bw.write("It is capital City of Karnataka");
            bw.newLine();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                bw.flush();
                bw.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
