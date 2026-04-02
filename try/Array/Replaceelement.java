// Q30. Replace All Elements Divisible by 3 with -1.
// •	Input: [3, 6, 7, 9, 10]
// •	Output: [-1, -1, 7, -1, 10]
// •	Explanation:
//  Elements divisible by 3 are 3, 6, 9. These are replaced with -1. Other elements remain unchanged.
 import java.util.*;
 public class Replaceelement{
	Scanner sc = new Scanner(System.in);
     public static void main(String args[]) {
		int array[] = { 3, 6, 7, 9, 10 };
		System.out.print("Array :");
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}

		for (int j = 0; j < array.length; j++) {
			if (array[j] % 3 == 0) {
				array[j] = -1;
			}
		}
		System.out.print("\nArray after replacement :");
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}
    }
 }