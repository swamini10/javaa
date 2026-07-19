
import java.util.Scanner;
public class Day4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter no of elements in Array :");
         int n=sc.nextInt();
         int[] arr= new int[n];
         
         System.out.println("Enter Array Element :");
         for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
         }

         System.out.print("Values at Odd Index  :");
         for(int i=0;i<arr.length;i++){
            if (i%2!=0){
                System.out.print(arr[i]+" ");
            }
         }
        System.out.println("");
          System.out.print("Values at Even Index  :");
          for(int i=0;i<arr.length;i++){
            if (i%2==0){
                System.out.print(arr[i]+" ");
            }
         }
    }
}

/* 
public class Day4 {
    public static void main(String args[]){
        int n= 5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
            System.out.print(" ");
            }
             for(int j=0;j<i;j++){
            System.out.print(i+" ");
            }
          System.out.println();
        }
    } 
}

debug:
--------1st line-----------------------------------------------------------------------------
  i     i<=n    s   s<=n-i    sop("_")     s++    j    j<=i   sop(" ")     j++      i++
  1     1<=4    1   1<=3       _            2
                2   2<=3       __           3
                3   3<=3       ___          4
                4   4<=3        out of loop       1    1<=1   ___1           2
                                                  2    2<=1     out of loop            2
--------2nd line------------------------------------------------------------------------------ 
  2     2<=4    1   1<=2       _            2
                2   2<=2       __           3
                3   3<=3        out of loop       1    1<=2   __2             2
                                                  2    2<=2   __2 2           3 
                                                  3    3<=2     out of loop            3 
--------3rd line------------------------------------------------------------------------------ 
  3     3<=4    1   1<=1       _            2
                2   2<=1        out of loop       1    1<=3   __3             2
                                                  2    2<=3   _3 3            3 
                                                  3    3<=3   _3 3 3          4
                                                  4    4<=3     out of loop            4 
--------4th line------------------------------------------------------------------------------       
  4     4<=4     1   1<=1        out of loop      1    1<=4    4              2
                                                  2    2<=4    4 4            3 
                                                  3    3<=4    4 4 4          4
                                                  4    4<=4    4 4 4 4        5
                                                  5    5<=4    out of loop              5  
--------5th line------------------------------------------------------------------------------ 
 5      5<=4     out of loop

___1        1st line
__2 2       2nd line
_3 3 3      3rd line
4 4 4 4     4th line
*/