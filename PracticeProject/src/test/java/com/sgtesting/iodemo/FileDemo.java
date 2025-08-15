package com.sgtesting.iodemo;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        //Create File Object
        File f1=new File("D:\\Demo\\Test\\Sample.txt");
        //Find teh name of teh File
        String s1=f1.getName();
        System.out.println("File Name :"+s1);
        //Display Parent Fodler name
        String s2=f1.getParent();
        System.out.println("Parent Folder :"+s2);
        File f=f1.getParentFile();
        System.out.println("Parent Folder :"+f);
        //Display File Path
        String path1=f1.getAbsolutePath();
        System.out.println("File Path :"+path1);
        String path2=f1.getPath();
        System.out.println("File Path :"+path2);
        //Verify File or Folder
        boolean v1=f1.isFile();
        System.out.println("Is it a File ?"+v1);
        boolean v2=f1.isDirectory();
        System.out.println("Is it a Folder ?"+v2);
        //File Permissions
        boolean v4=f1.canRead();
        System.out.println("Read Permission :"+v4);
        boolean v5=f1.canWrite();
        System.out.println("Write Permission :"+v5);
        boolean v6=f1.canExecute();
        System.out.println("Execute Permission :"+v6);

    }
}
