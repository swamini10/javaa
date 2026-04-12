public class demo1{
	public void add(int a, int b){
		System.out.println(a+b);
	}
	public void add(String a, int b ,int c){
		System.out.println(a+b+c);
	}
		public void add( int b ,int c,String a){
		System.out.println(b+c+a);
	}
public static void main(String args[]){
	demo1 d= new demo1();
	d.add(5,6);
	d.add("swamini",10,89);
	d.add(70,70,"sb");
	}
}