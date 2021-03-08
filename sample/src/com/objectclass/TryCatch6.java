package com.objectclass;

public class TryCatch6 {
	public void display()
	{
		String s =null;
		try
		{
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			//System.out.println(e);
			e.printStackTrace();
		}
		
	}

}
