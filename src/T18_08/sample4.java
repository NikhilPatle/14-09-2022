package T18_08;

public class sample4 
{

	//Separate
	public static void main(String[] args) {
		
		
		
		String s1 = "csmackm57\57654564scjneuih%*&^(W^*^R^@T&*";
		String s2="";
		String s3="";
		
		s2=s1.replaceAll("[^0-9]", "");
		s3=s1.replaceAll("[^a-zA-Z]", "");
		
		System.out.println(s2);
		System.out.println(s3);
		
		
				
	}
}
