// Q33. Check whether the given array is a palindrome.
// •	Input: {1, 2, 3, 2, 1}
// •	Output: true
// •	Explanation:
//  A palindrome reads the same forward and backward.
//  Forward: 1 2 3 2 1
//  Backward: 1 2 3 2 1
//  Since both are the same, the array is a palindrome.
 public class arrayisapalindrome{
        public static void main(String args[]){
            int array[] = { 1, 2, 3, 2, 1 };
            System.out.print("Array :");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + " ");
            }
            
            boolean isPalindrome = false;
            for (int i = 0; i < array.length / 2; i++) {
                if (array[i] == array[array.length - 1 - i]) {
                    isPalindrome = true;
                    break;
                }
            }
            
            System.out.println("\nIs the array a palindrome? " + isPalindrome);
        }
 }
