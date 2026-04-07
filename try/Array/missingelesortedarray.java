// Q38. Write a program in java to find the smallest missing element from a sorted array?
		
// Expected Output :
// 		The given array is : 0 1 3 4 5 6 7 9
// 		The missing smallest element is: 2

public class missingelesortedarray{
    public static void main(String args[]) {
        int array[] = {0, 1, 2, 4, 5, 6, 7, 9};
        System.out.print("Array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        int missingElement = findMissingElement(array);
        System.out.println("\nThe missing smallest element is: " + missingElement);
    }
    // Method to find missing element
    public static int findMissingElement(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i; // missing element found
            }
        }
        return -1; // no missing element
    }
}