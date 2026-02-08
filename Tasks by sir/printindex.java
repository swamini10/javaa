//Search and print index of give element

import java.util.Scanner;
	public class printindex
{
		public static void main(String args [])
	  {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " values:");
		
        for (int  i = 0; i < n; i++) 
		{
            arr[i] = sc.nextInt(); 
			
			System.out.print(arr[i]+" ");
			
		} System.out.println();
		 System.out.print("Enter array element : ");
		 int nu = sc.nextInt();
		  for (int  j = 0; j < n; j++) 
		{
		 if(nu==arr[j]){
			 
		 System.out.print(j+" is the index of "+nu);
		}
	}
    }
}

