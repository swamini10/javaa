// Q34. Return the first element that repeats in the array.
// •	Input: {10, 5, 3, 4, 3, 5, 6}
// •	Output: First repeating element is 5
// •	Explanation:
// o	Traverse from left:
// 	10 → first time.
// 	5 → first time.
// 	3 → first time.
// 	4 → first time.
// 	3 → already seen earlier → repeating, but not the first repeating (we must check carefully).
// 	5 → this was the earliest element that repeats.
// •	Therefore, the first repeating element is 5.

public class repeatingele {
	public static void main(String args[]){
		 int array[] = {10, 5, 3, 4, 3, 5, 6};
            System.out.print("Array :");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + " ");
            }
		 // Find first repeating element
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.print("\nrepeating element is: " + array[i]);
                   // return; // Exit after finding the first repeating element
               
                }
            }
        }

        System.out.println("\nNo other repeating element found");
    }
}
