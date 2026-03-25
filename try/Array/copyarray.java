// Q9. Write a java program to copy one array to another array.
// Input : Array1 = {5, 10, 15, 20}
// Output : Array2 = {5, 10, 15, 20}
// Explanation:
// Copy each element of Array1 into Array2 using index-by-index assignment.
public class copyarray{
	public static void main(String args[]){
		 int array[] = {1, 2, 3, 4, 5};
		 System.out.print("Array :");
		 for(int j=0;j<array.length;j++){
			 System.out.print(array[j] + " ");
		}
		System.out.print("\n Copy Array :");
		int copyarray[]= new int[array.length];
		for(int j=0;j<array.length;j++){
			 copyarray[j]=array[j];
		}
		for(int j=0;j<copyarray.length;j++){
			 System.out.print(copyarray[j] + " ");
		}
	}
}


