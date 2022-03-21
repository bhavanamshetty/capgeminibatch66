package com.capg.hello;

import java.util.Scanner;

public class MySwitch{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day number");
		int day = sc.nextInt();
		
		switch(day)
		{
		case 1:
			System.out.println("Sun");
			break;
		case 2:
			System.out.println("Mon");
			break;	
		case 3:
			System.out.println("Tue");
			break;
		case 4:
			System.out.println("Wed");
			break;
		case 5:
			System.out.println("Thu");
			break;
		case 6:
			System.out.println("Fri");
			break;
		case 7:
			System.out.println("Sat");
			break;	
		default:
			System.out.println("Wrong number");
		}
	}
	
}
