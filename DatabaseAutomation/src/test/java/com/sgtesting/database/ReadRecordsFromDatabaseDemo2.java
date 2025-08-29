package com.sgtesting.database;

import java.sql.*;

public class ReadRecordsFromDatabaseDemo2 {
    public static void main(String[] args) {
    //    readRecordsFromDatabaseTable();
        insertDemo();
    }

    private static void readRecordsFromDatabaseTable()
    {
        Connection conn=null;
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
            System.out.println("Connection has established successfully");

            String query="select * from dept";
            PreparedStatement stmt=conn.prepareStatement(query);
            ResultSet rs=stmt.executeQuery();
            ResultSetMetaData rsmeta =rs.getMetaData();
            String col1=rsmeta.getColumnName(1);
            System.out.printf("%-12s",col1);
            String col2=rsmeta.getColumnName(2);
            System.out.printf("%-12s",col2);
            String col3=rsmeta.getColumnName(3);
            System.out.printf("%-12s",col3);
            System.out.println();
            while(rs.next())
            {
                String dno=rs.getString("DEPTNO");
                String dname=rs.getString("DNAME");
                String loc=rs.getString("LOC");
                System.out.printf("%-12s",dno);
                System.out.printf("%-12s",dname);
                System.out.printf("%-12s",loc);
                System.out.println();

            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                conn.close();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    private static void insertDemo()
    {
        Connection conn=null;
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
            System.out.println("Connection has established successfully");

            String query="insert into dept values(60,'BANKING','MYSORE')";
            PreparedStatement stmt=conn.prepareStatement(query);
            stmt.executeUpdate();

        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                conn.close();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
