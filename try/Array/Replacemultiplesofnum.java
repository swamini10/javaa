// Q32. Replace all elements in the array that are multiples of 5 with the number 5 itself.
// •	Input: [10, 12, 15, 17, 20]
// •	Output: [5, 12, 5, 17, 5]
// •	Explanation:
// o	10 is divisible by 5 → replaced with 5.
// o	12 is not divisible by 5 → unchanged.
// o	15 is divisible by 5 → replaced with 5.
// o	17 is not divisible by 5 → unchanged.
// o	20 is divisible by 5 → replaced with 5.
import java.util.Scanner;
 public class Replacemultiplesofnum{
	 public static void main(String args[]){
		
	 Scanner sc= new Scanner(System.in);
		 int array[] = { 10, 12, 15, 17, 20};
		System.out.print("Array :");
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}
		System.out.print("\nEnter number :");
		int num = sc.nextInt();
		System.out.println("\nReplace all elements in the array that are multiples of " + num + " with the number " + num + " itself :");
		for (int j = 0; j < array.length; j++) {
			if(array[j]%num==0){
				array[j]=num;
			}
			System.out.print(array[j] + " ");
		}
	 } 
 }
