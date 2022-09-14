package T15_08;

public class example5 
{

	//separate Number and character
	
	public static void main(String[] args) {
		
		String s1 ="scnjnef545121%^@%*&^*(^*@%*@%&Y!)W*";
		String s2 = "";
		String s3 ="";
		
		s2=s1.replaceAll("[^A-Z]","");
		
		s3 = s1.replaceAll("[^0-9]","");
		
		System.out.println(s2);
		System.out.println(s3);
		
		
	}
}
