package com.skillio;

import java.util.Scanner;
public class ReverceArray {
	public static void main(String args[]) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter array size :");
		int num= sc.nextInt();
		int []arr =new int[num];
		System.out.print("Enter array elements :");
		for(int i=0;i<num;i++) 
		{
			arr[i]=sc.nextInt();
		}
		 for (int i=0;i<num/2;i++) 
		 {
	            int temp = arr[i];
	            arr[i] = arr[num - 1 - i];
	            arr[num-1-i] = temp;
	     }
		  for(int i=0;i<num;i++)
		  {
			 System.out.print(arr[i] + " ");
		 }
    }  
}
