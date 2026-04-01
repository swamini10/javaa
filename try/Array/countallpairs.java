// Q26. Write a java program to count all pairs of elements in an array whose sum is equal to a given number.	
// Input :- arr = [1, 5, 7, -1, 5]       
//  sum = 6
// Output :- 3
// Explanation:
// •	Pairs whose sum = 6 are:
// o	(1, 5) → first occurrence
// o	(7, -1)
// o	(1, 5) → second occurrence (from the second 5)
// •	Total pairs = 3
import java.util.Scanner;
public class countallpairs{
      public static void main(String args[]) {
		int array[] = { 1, 5, 7, -1, 5};
		System.out.print("Array :");
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number :");
        int num = sc.nextInt();
        int count = 0;
        for (int j = 0; j < array.length; j++) {
	       for (int i = j + 1; i < array.length; i++) {
		        if(array[j] + array[i] == num){
                    System.out.print("\nPair "+ count + " : " + array[j] + " " + array[i]);
                     count++;
                }
            }
		}
        System.out.print("\nTotal pairs = " + count);

    }
	
}
