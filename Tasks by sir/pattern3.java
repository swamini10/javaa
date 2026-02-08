public class pattern3{
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // print stars and numbers
            for (int k = 1; k <= i; k++) {
                if (i == 1 || i == n) {
                    System.out.print("* ");
                }
                else if (k == 1 || k == i) {
                    System.out.print("* ");
                }
                else {
                    System.out.print((k - 1) + " ");
                }
            }
            System.out.println();
        }
    }

}

      *
     * *
    * 1 *
   * 1 2 *
  * 1 2 3 *
 * 1 2 3 4 *
* * * * * * *