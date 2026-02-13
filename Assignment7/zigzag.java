
//Print a zig-zag star pattern (3 rows format).

public class zigzag{
	public static void main (String args[]){
		int n=5;
		    for(int i = 1; i <= n; i++) {
        // Left starting spaces
        for(int s = 1; s <= n-i; s++)
            System.out.print(" ");
        // First star
        System.out.print("1");
        // Space inside left V
        for(int s = 1; s <= 2*i-3; s++)
            System.out.print(" ");
        if(i > 1)
            System.out.print("*");
        // Middle gap
        for(int s = 2; s <= 2*(n-i)+1; s++)
            System.out.print(" ");
        // First star right side
        System.out.print("*");
        // Space inside right V
        for(int s = 1; s <= 2*i-3; s++)
            System.out.print(" ");
        if(i > 1)
           System.out.print("*");
        System.out.println();
    }  
	}
}
/*
    *         *
   * *       * *
  *   *     *   *
 *     *   *     *
*       * *       *

*/