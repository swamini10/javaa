public class PalindromeString {
    public static void main(String args[]){
  /*      String  str="sdrhs";
		String  rev="";
	 for (int i = str.length() - 1; i >= 0; i--){
			rev += str.charAt(i);
		}
		if(str.equals(rev)){
			System.out.print("yes");
		}else {
			System.out.print("no");
		}

*/
		int num=1234;
		int rev=0;
		while(num>0){
			int digit=num%10;
			  rev = rev * 10 + digit;  
            num = num / 10; 
		}
		System.out.print(rev);
    } 
}
