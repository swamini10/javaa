// Q29. Rearrange the array so that even and odd numbers alternate. Assume the number of even and odd elements is equal.
// 	Input :- arr = [1, 2, 3, 4, 5, 6]
// 	Output :-  [2, 1, 4, 3, 6, 5]
// Explanation:
// •	Even and odd elements are rearranged to appear alternately: Even → Odd → Even → Odd.
// •	The relative order within even and odd groups may not be important, but alternation is maintained.

public class Rearrangeevenodd{
    public static void main(String args[]) {
		int array[] = { 1, 2, 3, 4, 5, 6 };
		System.out.print("Array :");
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}
		 int result[] = new int[array.length];
		int evenIndex = 0; // Pointer for even numbers
		int oddIndex = 1;  // Pointer for odd numbers
        
		for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result[evenIndex] = array[i];
                evenIndex += 2;
            } else {
                result[oddIndex] = array[i];
                oddIndex += 2;
            }
        }
        System.out.print("\nRearranged Array: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}