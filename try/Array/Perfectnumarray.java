// Q37. Count the number of Perfect numbers in an array.
// •	Input: arr = [6, 28, 10, 12, 496]
// •	Output: Count of Perfect numbers = 3
// •	Explanation: A Perfect number is equal to the sum of its proper divisors (excluding itself). For each element, find the sum of divisors and compare with the number, then count.

public class Perfectnumarray{
    public static void main(String args[]) {

        int arr[] = {6, 28, 10, 12, 496};

        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int sum = 0;

            // find sum of proper divisors
            for (int j = 1; j <= num / 2; j++) {
                if (num % j == 0) {
                    sum += j;
                }
            }

            // check perfect number
            if (sum == num) {
                count++;
            }
        }

        System.out.println("\nCount of Perfect numbers: " + count);
    }
}