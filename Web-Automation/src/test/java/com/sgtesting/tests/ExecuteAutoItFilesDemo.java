package com.sgtesting.tests;

public class ExecuteAutoItFilesDemo {
    public static void main(String[] args) {
        executeFile();
    }

    private static void executeFile()
    {
        try
        {
            Runtime.getRuntime().exec("D:\\GitQARepository3\\CurrentworkSpace\\AutoIt\\WriteContentAndSaveFile.exe");
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
