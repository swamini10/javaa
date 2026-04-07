// Q36. Count the number of prime numbers in an array.
// •	Input: arr = [2, 5, 6, 9, 11]
// •	Output: Count of prime numbers = 3
// •	Explanation: Check each element if it is prime (only divisible by 1 and itself), and count such elements.


public class countprimenumberfromarray{
    public static void main(String args[]) {
        int array[] = {2, 5, 6, 9, 11};
        System.out.print("Array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        int count = 0;
        for (int j = 0; j < array.length; j++) {
            int num = array[j];
            boolean isPrime = true;
            // check if number is less than 2
            if (num < 2) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                count++;
            }
        }
        System.out.println("\nCount of prime numbers: " + count);
    }
}