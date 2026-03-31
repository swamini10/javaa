// Q20. Write a Java program to print all elements from an integer array that are greater than a given number.
// Explanation
// •	An integer array is given.
// •	A number N is also given.
// •	Traverse the array using a loop.
// •	Compare each element with N.
// •	If the element is greater than N, print it.
// Input :- Array: 10 25 5 40 18
//  Given Number: 20
// Output :- Elements greater than 20 : 25 40
import java.util.Scanner;
public class greaterthanenternum{
     public static void main(String args[]){
		 Scanner sc= new Scanner(System.in);
		 
		 int array[] ={10, 25, 5, 40, 18};
		 System.out.print("\nArray :");
		 for(int j=0;j<array.length;j++){
			 System.out.print(array[j] + " ");
		 }
		 System.out.print("\nEnter the Number :");
		 int num = sc.nextInt();
		 System.out.print("\nElements greater than "+num +" :");
		 for(int j=0;j<array.length;j++){
			 if(array[j]>num)
			 System.out.print(array[j] + " ");
		 }
     }     
}
