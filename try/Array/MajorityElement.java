// Q23. Write a Java program to find the Majority Element of an array.
// A majority element in an array of size n is an element that appears more than n/2 times. There can be at most one majority element in the array.
// Example :- The given array is: 4 8 4 6 7 4 4 8
//        There are no Majority Elements in the given array
// Explanation
// 1.	Traverse the array using two loops.
// 2.	For each element, count how many times it appears.
// 3.	If the count of any element is greater than n/2, that element is the majority element.
// 4.	If no such element is found after checking all elements, print that there is no majority element.

public class MajorityElement{
    public static void main(String args[]) {
        int array[] = {4, 8, 4, 6, 7, 4, 4, 8};

        System.out.print("\nArray: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }

        for (int j = 0; j < array.length; j++) {
            int count = 0; // ✅ Reset here (correct place)

            for (int k = 0; k < array.length; k++) {
                if (array[j] == array[k]) {
                    count++;
                }
            }

            if (count > array.length / 2) {
                System.out.println("\nMajority Element is: " + array[j]);
                return;
            }
        }

        System.out.println("\nThere is no Majority Element");
    }
}