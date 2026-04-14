public class learnArraylist {
	public static void main (String args[]){
		String [] stud = new String[30];//array withfixsize
		stud[0]="Swamini";		
	try{
		// now we wont to add new student in it that is 
		stud [30]="raj";// give exception ArrayIndexOutOfBoundsException
		}
		catch (Exception e){
			System.out.println("ArrayIndexOut Of Bounds Exception");
		}
	}
}