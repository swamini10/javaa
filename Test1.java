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
	if(num<=1){
		return false;
	}
	for(int i=0;i<=num;i++){
	if(num % 2==0){
		return true;
	}
}
 return false;
}
public static void main(String args[]){
int num=5;
System.out.println("fib"+fib(num));
System.out.println("fact"+fact(num));
System.out.println("prime"+Prime(num));
}
}