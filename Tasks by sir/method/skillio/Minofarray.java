package com.skillio;
import java.util.Scanner;

public class Minofarray {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter array size :");
		int num= sc.nextInt();
		int []arr =new int[num];
		System.out.print("Enter array elements :");
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int min= arr[0];
		  for (int  j = 0; j < num; j++) 
		{ 
	    if(arr[j]<min){
		min = arr[j];
	     }
		}
		System.out.print("Min element of the given array is : "+min);
  }
}
