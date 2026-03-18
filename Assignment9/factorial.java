//Write a program where constructor calculates factorial of a number

public class factorial{
     factorial(int n){ 
	 int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + n + " is: " + fact);
    }
	 
	 public static void main(String args[]){
	 factorial facto = new factorial(5);
	 }

}