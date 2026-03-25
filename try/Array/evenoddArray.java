// Q3. Write a Java program to display even & odd values from an array.
// Input:
//  Array Size = 6
//  Array Elements = 11 20 33 42 55 60
// Output:
//  Even Values = 20 42 60
//  Odd Values = 11 33 55
// Explanation:
// •	Traverse the array element by element.
// •	If an element is divisible by 2, it is even. Otherwise, it is odd.
// •	Separate lists are displayed for even and odd values.
import java.util.Scanner;
public class evenoddArray{
	public static void main(String args[]){
		Scanner sc =new Scanner (System.in);
		System.out.print("enter array size :");
		int i = sc.nextInt();
		
		System.out.println("enter "+i+"  elements in array :");
		int[] arr =new int[i];
		for(int j=0;j<arr.length ;j++){
			arr[j]=sc.nextInt();
		}
		
		System.out.print("separated even and odd elements from array :");
		System.out.print("\n even elements from array : ");
		for(int j=0;j<arr.length ;j++){
			if (arr[j] % 2==0){
						System.out.print(arr[j] +" ");
			}
		}
		System.out.print("\n odd elements from array : ");
		for(int j=0;j<arr.length ;j++){
			if (arr[j] % 2 !=0){
				System.out.print(arr[j] +" ");
			}
		}
	}
}