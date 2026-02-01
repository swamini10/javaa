import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();

        switch (num / 10) {
            case 1:
                System.out.println("Number is between 10 and 19");
                break;
            case 2:
                System.out.println("Number is between 20 and 29");
                break;
            case 3:
                System.out.println("Number is between 30 and 39");
                break;
            case 4:
                System.out.println("Number is between 40 and 49");
                break;
            case 5:
                System.out.println("Number is between 50 and 59");
                break;
            case 6:
                System.out.println("Number is between 60 and 69");
                break;
            case 7:
                System.out.println("Number is between 70 and 79");
                break;
            case 8:
                System.out.println("Number is between 80 and 89");
                break;
            case 9:
                System.out.println("Number is between 90 and 99");
                break;
            default:
                System.out.println("Number is not between 10 and 99");
        }
    }
}
