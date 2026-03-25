// Q7. Write a java program to display the reverse array.
// Input : Array = {1, 2, 3, 4, 5}
// Output : Reverse array = {5, 4, 3, 2, 1}
// Explanation :
// The last element becomes the first, and the first becomes the last by traversing from the end to the start.
public class reversearray{
	public static void main(String args[]){
		 int array[] = {1, 2, 3, 4, 5};
		 System.out.print("Array :");
		 for(int j=0;j<array.length;j++){
			 System.out.print(array[j] + " ");
		}
		System.out.print("\n Reverse Array :");
		 for(int j=array.length-1;j>=0;j--){
			 System.out.print(array[j] + " ");
		}
		
	}
}
