
/* 
public class day1 {

    public static void main(String[] args) {
        for(int i = 1; i <= 4 ; i++){
            for(int j = 4; j >= i; j--){
                System.out.print("* ");
            }
            System.out.println(""); 
       }
	}
}

debug:
i=1     i<=4    j=4     j>=i        sop(*)             j--          i++
1       1<=4    4       4>=1        *                  3
                3       3>=1        * *                2
                2       2>=1        * * *              1
                1       1>=1        * * * *            0
                0       0>=1       conditon false out of loop        2
                next line
2       2<=4    4       4>=2        *                  3
                3       3>=2        * *                2
                2       2>=2        * * *              1
                0       0>=2       conditon false out of loop        3
                next line
3       3<=4    4       4>=3        *                  3
                3       3>=3        * *                2
                2       2>=3       conditon false out of loop        4
                next line 
4       4<=4    4       4>=4        *                  3
                3       3>=4        conditon false out of loop        5
                next line 
5       5<=5     conditon false out of loop 


the final out put is look like 
*
* *
* * *
* * * *
*/


import java.util.Scanner;
public class day1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array :");
        int i = sc.nextInt();
        int[] arr = new int[i];
        System.out.print("enter " + i + " element in array :");
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt();
        }
       System.out.print("array elements:");
        for (int j = 0; j < arr.length; j++) {
            System.err.print(arr[j]+" ");
        }
    }
}
