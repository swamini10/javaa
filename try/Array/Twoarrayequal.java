// Q22. Write a Java program to check whether two integer arrays are equal.
//  Two arrays are considered equal if:
// 1.	Both arrays have the same length
// 2.	Corresponding elements at each index are exactly the same
// Do not use inbuilt methods like Arrays.equals().
// Input :- Array1 = {10, 20, 30, 40}
//             Array2 = {10, 20, 30, 40}
// Output :- Arrays are equal.
// Explanation
// 1.	First, check if the lengths of both arrays are equal
// o	If lengths are different → arrays are not equal
// 2.	If lengths are same, compare elements one by one using a loop
// 3.	If any element mismatch is found → arrays are not equal
// 4.	If all elements match → arrays are equal

public class Twoarrayequal{
	public static void main(String args[]){
		 int array1[] ={10, 20, 30, 40};
		 System.out.print("Array1 :");
		 for(int j=0;j<array1.length;j++){
			 System.out.print(array1[j] + " ");
		 }
		  int array2[] ={10, 20, 30, 40};
		 System.out.print("\nArray2 :");
		 for(int j=0;j<array2.length;j++){
			 System.out.print(array2[j] + " ");
		 }
        if(array1.length != array2.length){
            System.out.println("\narrays are not equal");
        } else {
            boolean isEqual = true;

            for(int j=0; j<array1.length; j++){
                if(array1[j] != array2[j]){
                    isEqual = false;
                    break;
                }
            }
            if(isEqual){
                System.out.println("\narrays are equal");
            } else {
                System.out.println("\narrays are not equal");
            }
        }
    }
}