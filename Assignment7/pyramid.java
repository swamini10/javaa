//Print a pyramid star pattern.
public class pyramid{
	public static void main (String args[]){
		int n=5;
		for(int line=1;line<=n; line++){
			 for (int space= 1; space <= n - line; space++) 
			 {
                System.out.print(" ");
            }
			for(int star=1;star<=(2*line)-1; star++){
				System.out.print("*");
		   }
		   System.out.println();
		}
	  
	}
}
/*
    *
   ***
  *****
 *******
*********
*/