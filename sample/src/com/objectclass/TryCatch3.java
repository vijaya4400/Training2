package com.objectclass;

public class TryCatch3 {
	public void display()
	{
		 String s = "abs";
		 try
		 {
			 int i = Integer.parseInt(s);
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	}

}
