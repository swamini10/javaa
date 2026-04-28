import java.util.Scanner;
public class missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n - 1];

        for(int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int totalSum = n * (n + 1) / 2;
        int arrSum = 0;

        for(int i=0;i<n-1;i++) {
            arrSum += arr[i];
        }

        System.out.println(totalSum - arrSum);
    }
}