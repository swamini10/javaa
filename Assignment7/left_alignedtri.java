//Print a left-aligned triangle pattern.
/*
public class left_alignedtri{
public static void main(String args[]){
		int n=5;
		for(int i=n;i>=1; i--){
			 for (int k= 1; k <= n - i; k++) 
			 {
                System.out.print(" ");
            }
			for(int j=1;j<=i; j++){
				System.out.print("*");
		   }
		   System.out.println();
		}
	}
}

*****
 ****
  ***
   **
    *


int i=n	 i>=1  	int k= 1     k <= n - i		sop("-")  k++   int j=1  j<=i  sop("*")  j++   sopln();  i-- 
	5    5>=1       1          1<=1          print     2	                                                  - 
														   
*/

public class left_alignedtri{
public static void main(String args[]){
		int n=5;
		for(int i=1;i<=n; i++){
			 for (int k= 1; k <= n - i; k++) 
			 {
                System.out.print(" ");
            }
			for(int j=1;j<=i; j++){
				System.out.print("*");
		   }
		   System.out.println();
		}
	}
}
    *
   **
  ***
 ****
*****
