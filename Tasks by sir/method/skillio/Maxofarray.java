package com.skillio;
import java.util.Scanner;
public class Maxofarray {	
	public static void main(String args [])
	  {
		Scanner sc = new Scanner(System.in);
      System.out.print("Enter array size : ");
      int n = sc.nextInt();
      int[] arr = new int[n];
      System.out.print("Enter " + n + " values:");
		int  i;for ( i = 0; i < n; i++) 
		{
            arr[i] = sc.nextInt(); 
			System.out.print(arr[i]+" ");
			
		} System.out.println();
     System.out.println();
		int max = arr[0];
		  for (int  j = 0; j < n; j++) 
		{ 
	    if(arr[j]>max){
		max = arr[j];
	     }
		}
		System.out.print("Max element of the given array is : "+max);
  }
}
