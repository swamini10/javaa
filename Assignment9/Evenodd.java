//Create a constructor that checks whether a number is even or odd.

public class Evenodd{
    public Evenodd(int n){
	 if(n%2==0){
	 System.out.println(n+"is a even number");
	 }else {
	 System.out.println(n+"is a odd number");
	 }
	}
	public static void main(String args[]){
	Evenodd e =new Evenodd(5);
	}
}