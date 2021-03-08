package com.objectclass;

import java.util.Scanner;

public class TryCatch4 {
	public void display()
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		try
		{
			int c = a/b;
		}
		catch(Exception e)
		{
			System.out.println(a/(b+2));//resolve the exception
		}
	}

}
