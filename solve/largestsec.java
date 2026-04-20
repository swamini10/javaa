//Second Largest Element
public class largestsec{
 public static void main(String args[]) {
        int arr[] = {2,0,9,0,8,1};
        int num1 = Integer.MIN_VALUE;
		 int num2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
			 int num = arr[i];
            if (num > num1) {
                num2 = num1;
                num1 = num;
            } else if (num > num2 && num != num1) {
                num2 = num;
            }
        }
		System.out.print(num2);
    }
}
