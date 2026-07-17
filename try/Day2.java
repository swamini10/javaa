/*

public class Day2 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++){
			   System.out.print(" "); 
			  }
            for (int j=1;j<=i;j++){
                System.out.print("* "); 
            }
               System.out.println("");
        }
    }
}

debug:
--------1st line-----------------------------------------------------------------------------
  i     i<=n    s   s<=n-i    sop("_")     s++    j    j<=i   sop("* ")     j++      i++
  1     1<=4    1   1<=3       _            2
                2   2<=3       __           3
                3   3<=3       ___          4
                4   4<=3        out of loop       1    1<=1   ___*           2
                                                  2    2<=1     out of loop            2
--------2nd line------------------------------------------------------------------------------                                                  
                

*/

import java.util.Scanner;

public class Day2{
    public static void main(String[] args) {
        System.out.println("enter no of ele : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int a=0;
         int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
          for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

         System.out.print("sum of elem in array:");
        for(int i=0;i<arr.length;i++){
             a =arr[i]+a;
        }
        System.out.print(a);
    }
}