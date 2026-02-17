public class patternnew{
	public static void main(String [] args){
		int n= 5;
		for( int i=1;i<=n;i++){
			for (int space=1; space<=n-i;space++ ){
				System.out.print(" "); 
			}
			for( int j=1;j<=2*i-1;j++){
				if(i==1|| j==1 || i==n || j==(2*i-1))
				  System.out.print("*"); 
				else
					System.out.print((j-1)); 
			}
			System.out.println(); 
		}
	}
}