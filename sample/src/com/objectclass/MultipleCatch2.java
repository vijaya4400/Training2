package com.objectclass;

public class MultipleCatch2 {
	public void display()
	{
		try
		{
			int a[] = new int[5];
			a[1]=35/0;
			//a[1] = 35/17;
			//System.out.println(a[1]);
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
