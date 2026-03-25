// Q4. Write a Java program to display even & odd index values from an array.
// Input:
//  Array Size = 6
//  Array Elements = 5 10 15 20 25 30
// Output:
//  Values at Even Index = 5 15 25
//  Values at Odd Index = 10 20 30
// Explanation:
// •	Index starts from 0.
// •	Even index positions are 0, 2, 4, ….
// •	 Odd index positions are 1, 3, 5, ….
// •	We print the values according to their index category.
import java.util.Scanner;
 public class Test{
	 public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
			System.out.print("Enter array element :");
			int i = sc.nextInt();
			int [] arr = new int [i];
		System.out.println("Enter "+i+" elements in array :");
		for (int j=0;j<arr.length;j++){
			arr[j]=sc.nextInt();
		}
		System.out.print("\n Values at Even Index:");
        for (int j=0;j<arr.length;j++){
		if(arr[j] % 2==0){
			System.out.print(" "+j);
			}		
	    }
		System.out.print("\n Values at Odd Index:");
        for (int j=0;j<arr.length;j++){
		if(arr[j] % 2!=0){
			System.out.print(" "+j);
			}		
	    }
	}
 }