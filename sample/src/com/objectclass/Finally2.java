package com.objectclass;

public class Finally2 {
	public void display()
	{
		try
		{
			int a = 20/0;
			System.out.println(a);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		finally
		{
			System.out.println("Finally block.....");
		}
	}
}
