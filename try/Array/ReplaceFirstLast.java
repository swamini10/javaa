
// Q31. Replace First and Last Element with 0.
// •	Input:[5, 3, 7, 2]
// •	Output: [0, 3, 7, 0]
// •	Explanation:
//  The first element (5) and the last element (2) are replaced with 0. Middle elements remain the same.
 public class ReplaceFirstLast{
	 public static void main(String args[]){
		 int array[] = { 5, 3, 7, 2 };
		System.out.print("Array :");
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}
		
		System.out.print("\n After replace first element and the last element by 0:");
		for (int j = 0; j < array.length; j++) {
			if((j==0)||(j==array.length-1)){
				array[j]=0;
			}
			System.out.print(array[j] + " ");
		}
	 } 
 }
