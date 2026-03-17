//Write a program to initialize an array using constructor

public class Array {
    int[] arr;
    // Constructor to initialize array
    public Array(int size) {
        arr = new int[size];
        // Initialize array with values
        for (int i = 0; i < size; i++) {
            arr[i] = i + 1; 
			System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Array obj = new Array(5);
    }
}