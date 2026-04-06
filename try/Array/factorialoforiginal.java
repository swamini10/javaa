// Q35. Replace each element with its factorial.
// •	Input: arr = [3, 4, 5]
// •	Output: arr = [6, 24, 120]
// •	Explanation: For each element, calculate factorial using repeated multiplication, and update the array element with this value.

public class factorialoforiginal {
    public static void main(String args[]) {
        int array[] = { 3, 4, 5 };
        System.out.print("Array :");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        // Create a new array to store the factorials
        int factorialArray[] = new int[array.length];
        // Calculate the factorial of each element and store it in the new array
        System.out.print("\n Array After factorial:");
        for (int j = 0; j < factorialArray.length; j++) {
            factorialArray[j] = 1;
            for (int k = 1; k <= array[j]; k++) {
                factorialArray[j] *= k;
            }
            System.out.print(factorialArray[j] + " ");
        }
    }
}