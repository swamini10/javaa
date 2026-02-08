// reverse the given array 

import java.util.Scanner;
public class reverse array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " values:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();   
        }
		
		System.out.print("array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
		System.out.println();
		System.out.print("reverse array:");
		for (int i = n-1; i >= 0; i-- ) {
            System.out.print(arr[i] + " ");
        }
		
    }
}
