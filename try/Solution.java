import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();   
        sc.nextLine();          

        while (t-- > 0) {
            String str = sc.nextLine();
            printPattern(str);
        }
    }

    static void printPattern(String str) {
        String even = "";
        String odd = "";

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0)
                even += str.charAt(i);
            else
                odd += str.charAt(i);
        }

        System.out.println(even + " " + odd);
    }
}