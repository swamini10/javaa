// find and print min number from array


import java.util.Scanner;
	public class minnum
{
		public static void main(String args [])
	  {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " values:");
		int  i;
        for ( i = 0; i < n; i++) 
		{
            arr[i] = sc.nextInt(); 
			
			System.out.print(arr[i]+" ");
			
		} System.out.println();
		int min = arr[0];
		  for (int  j = 0; j < n; j++) 
		{ 
	    if(arr[j]<min){
		min = arr[j];
	     }
		}
		System.out.print("Min element of the given array is : "+min);
    }
}

