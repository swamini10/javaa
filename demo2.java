public class demo2{
	public static boolean palindrome(int num){
		int or =num;
		int re = 0;
		while(num>0){
			int digit = num%10;
			re= re*10+digit;
			num=num/10;
		}
		if(or == re){
			return true;
		}
		return false;
	}
	
	//sum of digits of a number
	public static int sumofdigits(int num){
		int count=0;
		while(num>0){
			int digit = num%10;
			count = count + digit; 
			num=num/10;
		}
		return count;
	}
	//switch case for calculator
	public static int calculator(int ch, int a, int b){
        switch(ch){
            case 1:
                return a + b;

            case 2:
                return a - b;

            case 3:
                return a * b;

            case 4:
                return a / b;

            default:
                System.out.println("Invalid choice");
                return 0;
        }
    }
	//armstrong
	 public static boolean armstrong(int num) {
        int original = num;
        int sum = 0;

        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num = num / 10;
        }

        return sum == original;
    }
	
	public static void main (String args[]){
		  int a = 30;
        int b = 20;
        int num = 153;
        int ch = 1;
		System.out.println(palindrome(num));
		System.out.println(sumofdigits(num));
		System.out.println(calculator(ch,a,b));
		System.out.println(armstrong(ch));
	}
}
