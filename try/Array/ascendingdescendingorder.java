// Q39. Write a Java program to sort a given array in ascending & descending order.

// 	 Input : 	Array = [12, 5, 9, 34, 1]
// 	Output : 	Ascending Order: [1, 5, 9, 12, 34]
// Descending Order: [34, 12, 9, 5, 1]

public class ascendingdescendingorder{
	 public static void main(String args[]) {
        int arr[] = {12, 5, 9, 34, 1};
        System.out.print("Array: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }	
		for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

		 System.out.print("\nAscending Order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
		 System.out.print("\nDescending Order: ");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
		
}