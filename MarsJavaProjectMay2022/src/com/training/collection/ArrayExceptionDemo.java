package com.training.collection;

public class ArrayExceptionDemo {
	public static void main(String args[])
	{    
		CustomException c=new CustomException();
		
		int n=-5;
		try
		{
			c.getVal();
		if(n < 0)
		{
			throw new MyException("negative number");
	    }
		}
		catch (MyException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e)
		{
            System.out.println("Arithmetic exception handled");
        }
}
}