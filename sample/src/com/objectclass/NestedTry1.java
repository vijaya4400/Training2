package com.objectclass;

public class NestedTry1 {
	public void display()
	{
		try
		{
			try
			{
				int a[] = new int[5];
				a[5]=4/0;
			}
			catch(ArithmeticException ae)
			{
				System.out.println(ae);
			}
			try
			{
				String s = "abc";
				int i = Integer.parseInt(s);
			}
			catch(NumberFormatException nfe)
			{
				System.out.println(nfe);
			}
			try
			{
				String s = null;
				System.out.println(s.trim());
			}
			catch(Exception e)
			{
				//System.out.println(nfe);
				e.printStackTrace();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
