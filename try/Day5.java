
import java.util.Scanner;
public class Day5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        System.out.println("Enter no of element in array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array element :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even = even + 1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                odd = odd + 1;
            }
        }
        System.out.println("count of even element :" + even);
        System.out.println("count of odd element :" + odd);
    }
}

/*
import java.util.Scanner;
public class Day5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter no");
           int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if (i==1||i==n||j==1||j==n){
                    System.out.print("* ");
                }else{
                     System.out.print("- ");
                }
            }
            System.out.println();
        }

    }
}

 
debug:
------------------!st line ----------------------------------------------------------------------------------------
i       i<=n      j        j<=n    if(i==1||i==n||j==1||j==n)    {sop("*")}     else sop("-")         j++         i++
1       1<=4      1        1<=4      (1==1||1==4||1==1||1==4)       *                                  2
                  2        2<=4      (1==1||1==4||2==1||2==4)       * *                                3
                  3        3<=4      (1==1||1==4||3==1||3==4)       * * *                              4
                  4        4<=4      (1==1||1==4||4==1||4==4)       * * * *                            5
                  5        5<=4    out of loop                                                                      2  
                  
------------------2nd line ----------------------------------------------------------------------------------------
2       2<=4      1        1<=4      (2==1||2==4||1==1||1==4)       *                                  2
                  2        2<=4      (2==1||2==4||2==1||2==4)                     * -                  3
                  3        3<=4      (2==1||2==4||3==1||3==4)                     * - -                4
                  4        4<=4      (2==1||2==4||4==1||4==4)       * - - *                            5
                  5        5<=4    out of loop                                                                      3 

------------------3rd line ----------------------------------------------------------------------------------------
3       3<=4      1        1<=4      (3==1||3==4||1==1||1==4)       *                                  2
                  2        2<=4      (3==1||3==4||2==1||2==4)                     * -                  3
                  3        3<=4      (3==1||3==4||3==1||3==4)                     * - -                4
                  4        4<=4      (3==1||3==4||4==1||4==4)       * - - *                            5
                  5        5<=4    out of loop                                                                      4 

------------------4th line ----------------------------------------------------------------------------------------
4       4<=4      1        1<=4      (4==1||4==4||1==1||1==4)       *                                  2
                  2        2<=4      (4==1||4==4||2==1||2==4)       * *                                3
                  3        3<=4      (4==1||4==4||3==1||3==4)       * * *                              4
                  4        4<=4      (4==1||4==4||4==1||4==4)       * * * *                            5
                  5        5<=4    out of loop                                                                      5  
                  
------------------5th line ----------------------------------------------------------------------------------------
5      5<=4     out of loop
*/