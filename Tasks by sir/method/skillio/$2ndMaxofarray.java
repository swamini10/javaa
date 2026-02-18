package com.skillio;
import java.util.Scanner;
public class $2ndMaxofarray {	
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
		int smax =arr[0];
		  for (int  j = 0; j < n; j++) 
		{ 
	    if(arr[j]>max){
	     smax = max;
		max = arr[j];
	     }
	    else if(arr[j]>smax&&arr[j]!=max)
	    	  smax=arr[j];
		}
		System.out.println("2 nd Max element of the given array is : "+smax);
		System.out.print("Max element of the given array is : "+max);
  }
}
