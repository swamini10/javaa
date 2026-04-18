//find and print the prime no from array

import java.util.Scanner;

public class ArrayPrime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + " values: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Prime numbers are:");

        for (int i = 0; i < n; i++) {
            boolean isPrime = true;

            if (arr[i] <= 1) {
                isPrime = false;
            }

            for (int j = 2; j <= arr[i] / 2; j++) {
                if (arr[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}