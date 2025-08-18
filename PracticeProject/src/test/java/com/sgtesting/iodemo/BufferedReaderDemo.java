package com.sgtesting.iodemo;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        readContent();
    }

    private static void readContent()
    {
        BufferedReader br=null;
        try
        {
            br=new BufferedReader(new FileReader("D:\\Demo\\Test\\Sample.txt"));

            String sLine=null;
            while((sLine=br.readLine())!=null)
            {
                System.out.println(sLine);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                br.close();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
