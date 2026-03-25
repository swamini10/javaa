// Q2. Write a Java program to calculate the sum of all elements in an array.
// Input:
//  Array Size = 5
//  Array Elements = 2 4 6 8 10
// Output:
//  Sum of array elements = 30
// Explanation:
// •	Initialize a variable sum = 0.
// •	Traverse the array and keep adding each element to sum.
// •	After the loop ends, sum will hold the total of all array elements.
import java.util.Scanner;
public class sumofallele{
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array :");
		int i = sc.nextInt();
		
		int[] arr = new int[i];
		
		System.out.println("enter "+ i +" elements in array:");
		for(int j=0;j<arr.length;j++){
			arr[j]=sc.nextInt();
		}
		
		int sum =0;
		for(int j=0;j<arr.length;j++){
			 sum  =sum + arr[j];
		}
		System.out.println(sum);
	}
	
}
