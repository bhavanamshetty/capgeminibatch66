package com.capg.hello;

public class AscendingOrder {
	public static void main(String[] args) {
		int a[]= {1,10,2,20,3,30};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++) 
			{
				if(a[j]>a[i])                     //for descending just change this logic to   if(a[j]<a[i])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
			for(int j=0;j<a.length;j++) 
			{
				System.out.println(a[j]);
			}
			System.out.println("Minimum number "+a[0]);
			int size=a.length-1;
			System.out.println("the length is "+a.length);
			System.out.println("Maximum number is "+a[size]);       //maximum and minimum printing logic exchanges for  finding descending number
		
		
	}

}
