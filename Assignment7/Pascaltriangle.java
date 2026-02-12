
//Print a Pascal triangle style star pattern.

public class Pascaltriangle{
	public static void main (String args[]){
		int n=5;
		for(int line=1;line<=n; line++){
			 for (int space= 1; space <= n - line; space++) 
			 {
                System.out.print(" ");
            }
			for(int star=1;star<=line; star++){
				System.out.print(" *");
		   }
		   System.out.println();
		}
	  
	}
}
/*
     *
    * *
   * * *
  * * * *
 * * * * *
*/