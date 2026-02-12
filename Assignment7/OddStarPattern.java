
//Print a star pattern with increasing numbers of stars per row (odd numbers only).


public class OddStarPattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // print stars (odd numbers only)
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
