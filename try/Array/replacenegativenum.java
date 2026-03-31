// Q19. Given an integer array, replace all the negative numbers in the array with 0 and print the updated array.
// Explanation
// •	Traverse the array from the first element to the last.
// •	Check each element:
// o	If the element is negative, replace it with 0.
// o	If the element is zero or positive, keep it as it is.
// •	After completing the traversal, print the modified array.
// Input :- Array = [5, -3, 7, -1, 0, -6, 4]
// Output :- Updated Array = [5, 0, 7, 0, 0, 0, 4]

public class replacenegativenum{
	 public static void main(String args[]){
		 int array[] ={5, -3, 7, -1, 0, -6, 4};
		 System.out.print("\nArray :");
		 for(int j=0;j<array.length;j++){
			 System.out.print(array[j] + " ");
		 }
		 System.out.print("\nUpdated Array :");
		 for(int j=0;j<array.length;j++){
			 if(array[j]<0){
				  System.out.print(0 + " ");
			 }
			 else{
			 System.out.print(array[j] + " ");
			 }
		 }
	 }
}