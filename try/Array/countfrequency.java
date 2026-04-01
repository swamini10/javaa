// Q27. Write a java program to count the frequency of each element in a given array.
// Input:
// Array = {1, 2, 2, 3, 3, 3, 4}
// Output:
//  1 → 1 time
//  2 → 2 times
//  3 → 3 times
//  4 → 1 time
// Explanation:
// For each element, count how many times it occurs in the array using nested traversal.

public class countfrequency{
public static void main(String args[]) {
        int array[] = {1, 2, 2, 3, 3, 3, 4};
        boolean visited[] = new boolean[array.length];
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nFrequency of each element:");
        for (int i = 0; i < array.length; i++) {
            if (visited[i] == true)
                continue;
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(array[i] + " ~ " + count + (count > 1 ? " times" : " time") );
        }
    }
}