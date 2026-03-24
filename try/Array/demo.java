// Q1. Write a Java program to input an array & display it.
// Input:
//  Array Size = 5
//  Array Elements = 10 20 30 40 50
// Output:
//  10 20 30 40 50
// Explanation:
// •	First, we take the size of the array from the user.
// •	Then, elements are entered one by one into the array.
// •	Finally, using a loop, we display all elements in the same order they were entered

import java.util.Scanner;
public class demo{
    public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int i =sc.nextInt();
		
        int[] array = new int[i];
		
		System.out.println("enter "+ i +" elements in array:");
		for(int j=0;j<array.length;j++){
			array[j] = sc.nextInt();
		}
		
		System.out.println("array elements are :");
		for(int j=0;j<array.length;j++){
			 System.out.print(array[j] + " ");
		}
	}
}