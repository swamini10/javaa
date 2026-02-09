//sort the array 

import java.util.Scanner;
public class arraysort
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " values:");
        for (int i = 0; i < n; i++) 
		{
            arr[i] = sc.nextInt(); 
			//System.out.print(arr[i]+" ");
		}
		for (int j = 0; j < n; j++) 
		{
			for (int i = 0; i < n-1; i++) 
		    {   if(arr[i] > arr[i+1]){
				int temp= arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;}
			}
		}
		System.out.println("");
		 System.out.print("Array after sort:");
        for (int i = 0; i < n; i++) 
		{ 
			System.out.print(arr[i]+" ");
		}
		
	}
}