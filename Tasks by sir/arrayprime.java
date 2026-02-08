//find and print the prime no from array

import java.util.Scanner;
public class arrayprime
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
           if(arr[i]%2==0)
			System.out.print(arr[i]+" ");
		}				
	}
}