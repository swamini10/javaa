// Q14.  Write a java program to remove duplicated values from arrays.
// Input : Array = {10, 20, 20, 30, 40, 40, 50}
// Output : Unique elements = {10, 20, 30, 40, 50}
// Explanation:
// Traverse the array, check if element already exists before adding to result, thus avoiding duplicates.
public class removeduplicated{
    public static void main(String args[]){
		 int array[] ={10, 20, 20, 30, 40, 40, 50};
		 System.out.print("Array :");
		 for(int j=0;j<array.length;j++){
			 System.out.print(array[j] + " ");
		}System.out.print("\nUnique elements :");
		for (int j = 0; j < array.length; j++) {
         if (j == array.length - 1 || array[j] != array[j + 1]) {
        System.out.print(array[j] + " ");
       }
    }
 }
}
