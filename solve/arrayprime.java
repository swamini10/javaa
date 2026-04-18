public class ArrayPrime {

    public static void main(String args[]) {
        int arr[] = {29, 2, 4, 3, 23, 1};

        for (int i = 0; i < arr.length; i++) {
            isPrime(arr[i]);
        }
    }

    public static void isPrime(int num) {

        if (num <= 1) {
            System.out.println(num + " is not prime no");
            return;
        }

        for (int j = 2; j <= num / 2; j++) {
            if (num % j == 0) {
                System.out.println(num + " is not prime no");	
                return;
            }
        }
        System.out.println(num + " is prime no");
    }
}