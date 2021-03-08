package com.objectclass;

public class TryCatch2 {
	public void display()
	{
		int arr[] = new int[5];
		try
		{
			arr[10]=45;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}

}
