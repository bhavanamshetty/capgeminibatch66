package com.capg.hello;

public class LargestNumber {
	public static void main(String[] args) {
		int a[]= {1,10,20,3,30,25};
		int num=0;
		for(int i=0;i<a.length;i++)
		{
			if(num<a[i])         //to find the smallest number the logic changes to  if(num>a[i]) 
				                  //but since we take num=0 which is the smallest number it returns 0 as the smallest number
			{
				num=a[i];
			}
			
		}
		
		System.out.println(num);
		
	}

}
