// Q21. Given an integer array and a specific element, write a Java program to find the index position of that element in the array. If the element is not found, print -1.
// Explanation
// •	Traverse the array from index 0 to length - 1
// •	Compare each element with the target element
// •	If a match is found, return its index
// •	If the loop ends and no match is found, return -1
// Input :- Array: {10, 20, 30, 40, 50}
// Element to find: 30
// Output :- Element found at index: 2

import java.util.Scanner;
public class findindexpos{
     public static void main(String args[]){
		 Scanner sc= new Scanner(System.in);
		 
		 int array[] ={10, 20, 30, 40, 50};
		 System.out.print("\nArray :");
		 for(int j=0;j<array.length;j++){
			 System.out.print(array[j] + " ");
		 }
		 System.out.print("\nElement to find :");
		 int num = sc.nextInt();
		 for(int j=0;j<array.length;j++){
			 if(array[j]==num)
			 System.out.print("\nElement found at index :"+ j);
		 }
     }     
}

