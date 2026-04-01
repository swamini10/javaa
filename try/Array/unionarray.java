// Q28. Write a java program to find the union array of two unsorted arrays.
// 	Input :-  arr1 = [1, 2, 3]  
//    arr2 = [2, 3, 4, 5]
// 	Output :- [1, 2, 3, 4, 5]
// Explanation:
// •	Union combines all elements from both arrays.
// •	Duplicates are removed to keep only unique


public class unionarray {
    public static void main(String args[]) {

        int arr1[] = {1, 2, 3};
        int arr2[] = {2, 3, 4, 5};

        System.out.print("Array1: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.print("\nArray2: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.print("\nUnion combines all elements from both arrays: ");

        // Step 1: Print all elements of arr1
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        // Step 2: Print only unique elements from arr2
        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;

            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.print(arr2[i] + " ");
            }
        }
    }
 }