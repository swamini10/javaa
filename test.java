//simple try
public class test{
//Fact of number 
/*
public static int fact(int num){
	int fact=1;
	for (int i=1;i<=num;i++){
		fact=fact*i;
	}
	return fact;
}
public static void main (String args[]){
int num = 5;
int result = fact(num);
System.out.println(result);
}
*/


// prime number 
/*
public static boolean prime(int num){
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
	public static void main (String args[]){
int num = 9;
System.out.println(prime(num));
}*/




public static int fib(int n) {
    if (n <= 1)
        return n;

    return fib(n - 1) + fib(n - 2);
}
public static void main (String args[]){
int n = 2;
System.out.println(fib(n));
}
}