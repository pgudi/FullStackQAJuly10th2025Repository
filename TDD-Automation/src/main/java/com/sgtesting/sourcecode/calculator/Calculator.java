package com.sgtesting.sourcecode.calculator;

public class Calculator {
    /**
     * Method Name: multiplication
     * Parameters:
     * Purpose:
     * Description:
     */
    public int multiplication(int firstnumber,int secondnumber)
    {
        int result=0;
        try
        {
            result = (firstnumber * secondnumber);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Method Name: multiplication
     * Parameters:
     * Purpose:
     * Description:
     */
    public int multiplication(int numbers[])
    {
        int result=1;
        try
        {
            for(int i=0;i<numbers.length;i++)
            {
                result = result * numbers[i];
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Method Name: division
     * Parameters:
     * Purpose:
     * Description:
     */
    public int division(int firstnumber,int secondnumber)
    {
        int result=0;
        try
        {
            result = (firstnumber / secondnumber);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Method Name: addition
     * Parameters:
     * Purpose:
     * Description:
     */
    public int addition(int firstnumber,int secondnumber)
    {
        int result=0;
        try
        {
            result = (firstnumber + secondnumber);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Method Name: addition
     * Parameters:
     * Purpose:
     * Description:
     */
    public int addition(int numbers[])
    {
        int result=0;
        try
        {
            for(int i=0;i<numbers.length;i++)
            {
                result = result + numbers[i];
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Method Name: subtraction
     * Parameters:
     * Purpose:
     * Description:
     */
    public int subtraction(int firstnumber,int secondnumber)
    {
        int result=0;
        try
        {
            result =(firstnumber - secondnumber);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }
}
