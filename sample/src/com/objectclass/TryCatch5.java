package com.objectclass;

import java.util.Scanner;

public class TryCatch5 {
	public void display()
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		//String b = sc.next();
		char ch = 'a';
		System.out.println((int)ch);
		try
		{
			int c = a/ch;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
