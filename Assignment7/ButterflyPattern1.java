public class ButterflyPattern1 {

		public static void main(String args[]){
		int n=5;
		for(int i=1 ;i<=n; i++){
			for(int j=1;j<=i; j++){
				System.out.print(" *");
		   }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
		   System.out.println();
		}
		
	}
}

/*
i=1	i<=n	j=1 j<=i sop("*")	j++  j=1   j<=2*(n-i)       sop("-")         j++    j=1  j<=i   sop("*")          j++   sopln()    i++
1   1<=5    1	1<=1   *        2
            2   2<=1  false           1	   1<=8           *-                  2
			                          2    2<=8           *--                 3 
                                      3    3<=8           *---                4 
                                      4    4<=8           *----                5 
                                      5    5<=8           *-----               6 
                                      6    6<=8           *------              7 
                                      7    7<=8           *-------             8 
                                      8    8<=8           *--------            9
                                      9   false                                      1	 1<=1      *--------*       2
                                                                                     2   2<=1         false        			nextline  2
1   2<=5    1	1<=2   *        2
            2   2<=2   **       3
            3   3<=2  false           1	   1<=6           **-                  2
			                          2    2<=6           **--                 3 
                                      3    3<=6           **---                4 
                                      4    4<=6           **----                5 
                                      5    5<=6           **-----               6 
                                      6    6<=6           **------              7 
                                      7   false                                      1	 1<=2      **------*       2
									                                                 2   2<=2      **------**      3
                                                                                     3   3<=2         false        			nextline  3
*/																						 




