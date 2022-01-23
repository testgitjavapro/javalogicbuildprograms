package com.arrays;

public class Arraysum {
	int totalsum =0;
	public static void sumarray(int [] num)
	{
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			sum=sum+num[i];
		}
		System.out.println("Array sum = "+sum);
	}
	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4,5};
		sumarray(a);
		
	}
	
	

}
