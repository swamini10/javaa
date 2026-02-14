/*
Print a Hollow Diamond Star Pattern
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *

*/

public class HollowDiamond{
	public static void main(String args[]){
		int n=5;
	    	for(int i=1;i<=n;i++){
			for(int space=1;space<=n-i;space++){
			System.out.print(" ");
		  }
		  for(int j=1;j<=i;j++){
			 if(i==1||j==1||j==n||j==i){
				  System.out.print(" *");
			 }else
			  System.out.print("  ");
		  }
		  System.out.println();
		}
		for(int i=n-1;i>=1;i--){
			for(int space=1;space<=n-i;space++){
			System.out.print(" ");
		  }
		  for(int j=1;j<=i;j++){
			 if(i==1||j==1||j==n||j==i){
				  System.out.print(" *");
			 }else
			  System.out.print("  ");
		  }
		  System.out.println();
		}
	}
}