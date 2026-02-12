//Print a hollow pyramid.

public class hollowpyramid{
	public static void main (String args[]){
		int n=5;
		for(int line=1;line<=n; line++){
			 for (int space= 1; space <= n - line; space++) 
			 {
                System.out.print(" ");
            }
			for(int star=1;star<=line; star++){
				if(star==1||line==1||star==line||line==n)
				System.out.print(" *");
			else
				System.out.print("  ");
		   }
		   System.out.println();
		}
	  
	}

}

     *
    * *
   *   *
  *     *
 * * * * *