// Q15. Write a java program to find common elements between two arrays.
// Input :
//  Array1 = {1, 2, 3, 4, 5}
//  Array2 = {3, 4, 5, 6, 7}
// Output : Common elements = {3, 4, 5}
// Explanation : Compare each element of Array1 with all elements of Array2, if match found → it is a common element.

public class commonelement{
	public static void main(String args[]){
		 int array1[] ={1, 2, 3, 4, 5};
		 System.out.print("Array1 :");
		 for(int j=0;j<array1.length;j++){
			 System.out.print(array1[j] + " ");
		 }
		  int array2[] ={3, 4, 5, 6, 7};
		 System.out.print("\nArray2 :");
		 for(int j=0;j<array2.length;j++){
			 System.out.print(array2[j] + " ");
		 }
		 System.out.print("\nCommon elements :");
		  for(int j=0;j<array1.length;j++){
			  for(int i=0;i<array2.length;i++){
				  if(array1[j]==array2[i]){
					 System.out.print(array1[j] + " "); 
				  }
		     }
		  }
	}
}
