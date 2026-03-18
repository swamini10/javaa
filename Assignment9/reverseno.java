//Create a program that uses constructor to reverse a number.

public class reverseno{
       public reverseno(int n){
	    int reverse = 0;
        while(n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        System.out.println("Reversed number: " + reverse);
    }
	   public static void main(String args[])
	   {
	   reverseno r1 = new reverseno(786);
	}
}