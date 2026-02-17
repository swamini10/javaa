public class samplepatters{
	public void getPyramid(int n){
		for(int line=1;line<=n; line++){
			 for (int space= 1; space <= n - line; space++) 
			 {
                System.out.print(" ");
            }
			for(int star=1;star<=(2*line)-1; star++){
				System.out.print("*");
		   }
		   System.out.println();
		}
	}
	
	public void getReversePyramid(int n){
		for(int line=n;line>=1; line--){
			 for (int space= 1; space <= n - line; space++) 
			 {
                System.out.print(" ");
            }
			for(int star=1;star<=(2*line)-1; star++){
				System.out.print("*");
		   }
		   System.out.println();
		}
	}
	public void getDiamond(int n){
		for(int line=1;line<=n; line++)
		{
			for (int space= 1; space <= n - line; space++) 
			{
                System.out.print(" ");
            }
			for(int star=1;star<=line; star++)
			{
				System.out.print(" *");
		    }
		   System.out.println();
		}
		for(int line=n-1;line>=1; line--){
			 for (int space= 1; space <= n - line; space++) 
			 {
                System.out.print(" ");
            }
			for(int star=1;star<=line; star++){
				System.out.print(" *");
		   }
		   System.out.println();
		}
		
	}
	public void getNumberPattern(int n){
		for(int i=1;i<=n;i++){
			  for(int s=1;s<=n-i;s++){
			   System.out.print(" "); 
			  }
			    for(int j=1;j<=i;j++){	
				System.out.print(" "+j); 
			} 
			System.out.println(); 
		}
	}
		public void getCharPattern(int n){
			for(int i=1;i<=n;i++){
			  for(int s=1;s<=n-i;s++){
			   System.out.print(" "); 
			  }
			  char c='a';
			    for(int j=1;j<=i;j++){	
				System.out.print(" "+c); 
				c++;
			} 
			System.out.println(); 
		}
		}
	
}