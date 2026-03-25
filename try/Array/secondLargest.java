// Q11. Write a java program to give an array, find the second largest element.
// Input : Array = {12, 35, 1, 10, 34, 1}
// Output : Second largest = 34
// Explanation:
// First largest is 35, second largest is the next maximum (34). We maintain two variables (largest, secondLargest).
import java.util.Scanner;
public class secondLargest{
	public static void main(String args[]){
			Scanner sc =new Scanner (System.in);
		 int array[] = {1, 2, 3, 4, 5};
		 System.out.print("Array :");
		 for(int j=0;j<array.length;j++){
			 System.out.print(array[j] + " ");
		}
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int j=0;j<array.length;j++){
			if(array[j]>largest){
				secondLargest=largest;
				largest=array[j];
			}
			else if(array[j]>secondLargest && array[j]!=largest){
				secondLargest=array[j];
			}
		}		System.out.print("\n Second Largest : " + secondLargest);
		System.out.print("\n  Largest : " + largest);
   }
}
