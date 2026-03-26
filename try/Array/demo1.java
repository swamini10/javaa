// Q13. Write a java program to display only non-zero values from an array.
// Input : Array = {1, 0, 5, 0, 7, 0, 9}
// Output : Non-zero elements = {1, 5, 7, 9}
// Explanation :
// Traverse the array and print only elements that are not equal to zero.

public class demo1{
	public static void main(String args[]){
		 int array[] ={1, 0, 5, 0, 7, 0, 9};
		 System.out.print("Array :");
		 for(int j=0;j<array.length;j++){
			 System.out.print(array[j] + " ");
		}System.out.print("\nNon-zero elements from Array :");
		 for(int j=0;j<array.length;j++){
			 if(array[j]!=0){
				 System.out.print(" "+array[j]); 
			 }
		}
	}
}