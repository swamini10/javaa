import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number:");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Weird");
        } 
        else if (num % 3 == 0) {
            System.out.println("hi");
        } 
        else if (num % 5 == 0) {
            System.out.println("hello");
        }
    }
}
