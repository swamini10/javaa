// Q24. Write a program in java to rotate an array by N positions ?
// Expected Output:
// 	The given array is: 0  3  6  9  12  14  18  20  22  25  27
// 	From 4th position the values of the array are: 12 14 18 20 22 25 27 
// 	Before 4th position the values of the array are: 0  3  6  9 
// 	After rotating from 4th position the array is: 12 14 18 20 22 25 27 0 3  6 9

import java.util.Scanner;

public class rotateanarray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int array[] = { 0, 3, 6, 9, 12, 14, 18, 20, 22, 25, 27 };
		System.out.print("Array :");
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}
		System.out.print("\nEnter position where to rotate an array :");
		int pos = sc.nextInt();

		System.out.print("\nfrom " + pos + " position the values of the array are:");
		for (int j = pos; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}

		System.out.print("\nBefore " + pos + " position the values of the array are:");
		for (int j = 0; j < pos; j++) {
			System.out.print(array[j] + " ");
		}
		System.out.print("\nafter" + pos + " position the values of the array are:");
		for (int j = pos; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}
		// from start to pos-1
		for (int j = 0; j < pos; j++) {
			System.out.print(array[j] + " ");
		}
	}
}
