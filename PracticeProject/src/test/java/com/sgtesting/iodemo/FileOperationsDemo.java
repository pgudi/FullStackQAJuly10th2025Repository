package com.sgtesting.iodemo;

import java.io.File;

public class FileOperationsDemo {
    public static void main(String[] args) {
    //    createFile();
    //    renameFile();
    //    deleteFile();
        fileCollections();
    }
    private static void createFile()
    {
        try
        {
            File f1=new File("D:\\Demo\\Test\\Welcome.txt");
            f1.createNewFile();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void renameFile()
    {
        File f1=new File("D:\\Demo\\Test\\Welcome.txt");
        File f2=new File("D:\\Demo\\Test\\WelcomeNew.txt");
        f1.renameTo(f2);
    }
    private static void deleteFile()
    {
        File f2=new File("D:\\Demo\\Test\\WelcomeNew.txt");
        boolean v1=f2.delete();
        System.out.println("Is File deleted ?:"+v1);
    }

    private static void fileCollections()
    {
        try
        {
            File file=new File("D:\\Demo\\Test");
            File files[]=file.listFiles();
            for(int i=0;i<files.length;i++)
            {
                if(files[i].isFile()==true)
                {
                    String path=files[i].getAbsolutePath();
                    System.out.println(path);
                }
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
