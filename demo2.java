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
	public static void main (String args[]){
		int num=122321;
		System.out.println(palindrome(num));
	}
}