public class mularray
{
	public static void main(String args [])
	{
		int [][] arr ={{1,2},{3,4,5,34},{6,7,8,9}};
		int sum = 0;
			int maxSum = 0;
			int maxIndex =-1;
		for(int p = 0; p < arr.length ; p++){
			for(int c = 0; c < arr[p].length ; c++){
				System.out.print(arr[p][c]+" ");
				sum=sum+ arr[p][c];
			}
			System.out.println("{index "+p+" sum:"+ sum +"}");		
			if (sum > maxSum) {
                maxSum = sum;
                 maxIndex = p;
            }
		}
		  System.out.println("Maximum Sum = " + maxSum);
        System.out.println("Sub-array Index with Maximum Sum = " + maxIndex);
	}
}