package com.sgtesting.iodemo;

import java.io.File;

public class FolderOperationsDemo {
    public static void main(String[] args) {
    //    createFolder();
    //    createNestedFolders();
   //     renameFolder();
    //    deleteFolder();
        folderCollections();
    }

    private static void createFolder()
    {
        File f1=new File("D:\\Demo\\Test\\Reading");
        f1.mkdir();
    }

    private static void createNestedFolders()
    {
        File f1=new File("D:\\Demo\\Test\\F1\\F2\\F3\\F4\\F5");
        f1.mkdirs();
    }

    private static void renameFolder()
    {
        File f1=new File("D:\\Demo\\Test\\Reading");
        File f2=new File("D:\\Demo\\Test\\ReadingSubjects");
        f1.renameTo(f2);
    }

    private static void deleteFolder()
    {
        File f2=new File("D:\\Demo\\Test\\ReadingSubjects");
        boolean v1=f2.delete();
        System.out.println("Is Folder deleted ?:"+v1);
    }

    private static void folderCollections()
    {
        try
        {
            File file=new File("D:\\Demo\\Test");
            File files[]=file.listFiles();
            for(int i=0;i<files.length;i++)
            {
                if(files[i].isDirectory()==true)
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

