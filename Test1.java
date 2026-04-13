public class Test1{
public static int fib(int num){
   if(num<=1){
		return num;
	}
   return fib (num-1)+(num-2);
}

public static int fact(int num){
  int fact =1;
  for (int i=1;i<=num;i++){
	  fact=fact*i;
  }
  return fact;
}

public static boolean Prime(int num){
    if(num <= 1){
        return false;
    }
    for(int i = 2; i <= num/2; i++){
        if(num % i == 0){
            return false;
        }
    }
    return true;
}
public static void main(String args[]){
int num=5;
System.out.println("fib"+fib(num));
System.out.println("fact"+fact(num));
System.out.println("prime"+Prime(num));
}
}