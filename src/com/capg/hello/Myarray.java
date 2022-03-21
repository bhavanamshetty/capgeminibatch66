package com.capg.hello;

import java.util.Scanner;

public class Myarray {
	public static void main(String[] args)
	{
		int b[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements");
		for(int i=0;i<5;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("Array elements");
		for(int i=0;i<5;i++)
		{
			
			System.err.println(b[i]);
			
		}
	}

}
