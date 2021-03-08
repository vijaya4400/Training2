package com.objectclass;

public class MultipleCatch3 {
	public void display()
	{
		try
		{
			String s = null;
			System.out.println(s.length());
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println(aie);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		/*catch(Exception e)
		{
			System.out.println(e);
		}*/
	}

}
