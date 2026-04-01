// Q25. Move all zeros in an array to the end while maintaining the relative order of non-zero elements.
// 	Input :- arr = [0, 1, 0, 3, 12]
// 	Output :- arr = [1, 3, 12, 0, 0]
// Explanation:
// •	All non-zero elements [1, 3, 12] retain their original order.
// •	All zeros are moved to the end of the array.

public class moveallzeroatend{
	public static void main(String args[]) {
		int array[] = { 0, 1, 0, 3, 12 };
		System.out.print("Array :");
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}
        System.out.print("\nAll non-zero elements :");
        for (int j = 0; j < array.length; j++) {
            if(array[j]!=0){
			System.out.print(array[j] + " ");
            }
		}
         System.out.print("\nAll zeros are moved to the end of the array :");
        for (int j = 0; j < array.length; j++) {
            if(array[j]!=0){
			System.out.print(array[j] + " ");
            }
		}
        for (int j = 0; j < array.length; j++) {
            if(array[j]==0){
			System.out.print(array[j] + " ");
            }
		}
    }
}