// Q35. Create a new array where each element is the square of the original.
// •	Input: arr = [2, 4, 6, 8]
// •	Output: newArr = [4, 16, 36, 64]
// •	Explanation: For each index, calculate arr[i] * arr[i] and store it in the new array.

public class squareoforiginal {
    public static void main(String args[]) {
        int array[] = { 2, 4, 6, 8 };
        System.out.print("Array :");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        // Create a new array to store the squares
        int squaredArray[] = new int[array.length];
        // Calculate the square of each element and store it in the new array
        System.out.print("\n Array After square:");
        for (int j = 0; j < squaredArray.length; j++) {
            squaredArray[j] = array[j] * array[j];
            System.out.print(squaredArray[j] + " ");
        }
    }
}
