package com.abhay.core;

public class OddAndEven {
public static void main(String[] args) {
	int a[]= {1,2,5,6,3,2,8,10,11};
	System.out.println("Odd numbers: ");
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2!=0)
		{
			System.out.println(a[i]);
		}
	}
	System.out.println("Even numbers: ");
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			System.out.println(a[i]);
		}
	}
}
}
