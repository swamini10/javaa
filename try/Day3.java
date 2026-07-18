/*

public class Day3{
    public static void main(String args[]){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++){
                System.out.print("_");
            }
             for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}

debug:
--------1st line-----------------------------------------------------------------------------
  i     i<=n    s   s<=n-i    sop("_")     s++    j    j<=i   sop("1 ")     j++      i++
  1     1<=4    1   1<=3       _            2
                2   2<=3       __           3
                3   3<=3       ___          4
                4   4<=3        out of loop       1    1<=1   ___1           2
                                                  2    2<=1     out of loop            2
--------2nd line------------------------------------------------------------------------------ 
  2     2<=4    1   1<=2       _            2
                2   2<=2       __           3
                3   3<=3        out of loop       1    1<=2   __1             2
                                                  2    2<=2   __1 2           3 
                                                  3    3<=2     out of loop            3 
--------3rd line------------------------------------------------------------------------------ 
  3     3<=4    1   1<=1       _            2
                2   2<=1        out of loop       1    1<=3   __1             2
                                                  2    2<=3   _1 2            3 
                                                  3    3<=3   _1 2 3          4
                                                  4    4<=3     out of loop            4 
--------4th line------------------------------------------------------------------------------       
  4     4<=4     1   1<=1        out of loop      1    1<=4    1              2
                                                  2    2<=4    1 2            3 
                                                  3    3<=4    1 2 3          4
                                                  4    4<=4    1 2 3 4        5
                                                  5    5<=4    out of loop              5  
--------5th line------------------------------------------------------------------------------ 
 5      5<=4     out of loop

___1        1st line
__1 2       2nd line
_1 2 3      3rd line
1 2 3 4     4th line
*/

import java.util.Scanner;
public class Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("no of element in array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter ele in arr :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("even ele array:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.print("odd ele array:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
