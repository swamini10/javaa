// Q8. Write a java program to find missing elements in an array.
// Input : Array = {1, 2, 4, 5, 7} (numbers from 1 to 7 should be present)
// Output : Missing elements = {3, 6}
// Explanation:
// Check sequence numbers one by one. If a number from 1 to maximum (7) is not in the array, it is missing.
public class missingele{
	public static void main(String args[]){
		 int array[] = {1, 2, 3, 4, 5};
		 System.out.print("Array :");
		 for(int j=0;j<array.length;j++){
			 System.out.print(array[j] + " ");
		}
		System.out.print("\n Missing elements :");
		 for(int j=1;j<=7;j++){
			 boolean found = false;
			 for(int k=0;k<array.length;k++){
				 if(array[k] == j){
					 found = true;
					 break;
				 }
			 }
			 if(!found){
				 System.out.print(j + " ");
			 }
		 }
	}
}