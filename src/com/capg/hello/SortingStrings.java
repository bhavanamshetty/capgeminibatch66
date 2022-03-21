package com.capg.hello;

public class SortingStrings {
	public static void main(String[] args) { 
//		String str1="D";
//		String str2="Z";                                     this code is to compare two char 
//		this makes use of comapre to method
//		System.out.println((int)str1.charAt(0));
//		System.out.println((int)str2.charAt(0));
		
//		int diff=str1.compareTo(str2);
//		System.out.println("result"+diff);       //if str1 is equal to str2 it returns zero
//		                                          //if str1 is greayer than str2 it returns difference(a positive number)
//	                                              	//if str1 is less than str2 it returns a negative number 
//		   
		String a[]= {"Zee", "Johan", "Kumar", "Ajay", "mahesh", "priya"};
		
				for(int i=0;i<a.length;i++)
				{
					for(int j=0;j<a.length;j++) 
					{
						if(a[j].compareTo(a[i])>0)                     //for descending just change this logic to   if(a[j].compareTo(a[j])<0
						{
							String temp=a[i];
							a[i]=a[j];
							a[j]=temp;
						}
						
					}
				}
				System.out.println("the ascending order is:");
				for(int j=0;j<a.length;j++) 
				{
					
					System.out.println(a[j]);
				}
				
		
		
	}
	

}
