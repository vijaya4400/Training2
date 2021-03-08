package com.objectclass;

public class MultipleCatch1 {
	public void display()
	{
		try
		{
			int a[] = new int[5];
			a[10] = 35/17;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println(aie);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
