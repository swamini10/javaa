//Print a right-angled triangle star pattern.

public class righttriangle{
	public static void main(String args[]){
		int n=5;
		for(int i=n;i>=1; i--){
			for(int j=i;j<=n; j++){
				System.out.print(" *");
		   }
		   System.out.println();
		}
	}
}
 *
 * *
 * * *
 * * * *
 * * * * *