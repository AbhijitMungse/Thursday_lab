package com.abhay.core;

public class NegativeNumbers {
public static void main(String[] args) {
	int i=0;
	int []neg_array= {-40,14,-4,2,11,-5,-9};
	
	System.out.println("\n list of negative numbers in array: ");
	while(i<neg_array.length)
	{
		if(neg_array[i]<0)
		{
			System.out.format("%d",neg_array[i]);
		}
		i++;
	}
}
}
