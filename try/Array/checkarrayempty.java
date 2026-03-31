// Q18. Write a Java program to check whether a given array is empty or not.

// Explanation
// 1.	Every array has a predefined property called length.
// 2.	If array.length == 0, then the array is empty.
// 3.	Otherwise, the array contains elements.

// Input :- Array elements: { }
// Output :- Array is empty

public class checkarrayempty {
	 public static void main(String args[]){
		 int array[] ={ };
		
		 if(array.length==0){
			 System.out.print("\nArray is empty");
		 }else{
		 System.out.print("\nArray elements:");
		  for(int j=0;j<array.length;j++){
			 System.out.print(array[j] + " ");
		  }
		}
    }
}