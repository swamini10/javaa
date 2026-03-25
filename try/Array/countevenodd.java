// Q5. Write a Java program to count even & odd values from an array.
// Input:
//  Array Size = 7
//  Array Elements = 12 17 24 39 40 55 70
// Output:
//  Count of Even Values = 4
//  Count of Odd Values = 3
// Explanation:
// •	Initialize counters: evenCount = 0, oddCount = 0.
// •	For each element in the array:
// o	If divisible by 2 → increase evenCount.
// o	Otherwise → increase oddCount.
// •	Final counts are displayed.
import java.util.Scanner;
public class countevenodd{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of array :");
		int i = sc.nextInt();
		int [] arr = new int[i];
	System.out.print("enter "+i+" element in array :");
	for(int j=0;j<arr.length;j++){
		arr[j]=sc.nextInt();
	}
        int evenCount = 0;
        int oddCount = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("\nCount of even values from array: " + evenCount);
        System.out.println("Count of odd values from array: " + oddCount);
    }
}
