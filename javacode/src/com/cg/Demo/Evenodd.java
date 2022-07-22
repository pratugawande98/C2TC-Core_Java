package com.cg.Demo;

import java.util.Scanner;

public class Evenodd
{
	public static void main (String[] args)
	{
		Scanner a =new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=a.nextInt();
		if(num%2 == 0)
		{
			System.out.println(num+ "is even");
			
		}
		else
		{
			System.out.println(num+ "is odd");
		}
		
			
	}

}
