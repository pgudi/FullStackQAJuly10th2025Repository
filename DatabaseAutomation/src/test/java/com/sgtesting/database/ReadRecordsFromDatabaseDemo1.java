package com.sgtesting.database;

import java.sql.*;

public class ReadRecordsFromDatabaseDemo1 {
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
            conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
            System.out.println("Connection has established successfully");
            Statement stmt=conn.createStatement();
            String query="select * from dept";
            ResultSet rs=stmt.executeQuery(query);
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
            Statement stmt=conn.createStatement();
            String query="insert into dept values(50,'HEALTH','BANGALORE')";
            stmt.executeUpdate(query);

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
