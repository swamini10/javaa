//Print a half diamond pattern.

public class halfDiamondPattern {
	public static void main (String args[]){
	int n=5;
	    for(int i=n;i>=1; i--){
			for(int j=i;j<=n; j++){
				System.out.print(" *");
		   }
		   System.out.println();
		}
		for(int i=1;i<=n; i++){
			for(int j=i;j<=n-1; j++){
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
 * * * *
 * * *
 * *
 *
