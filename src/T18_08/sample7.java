package T18_08;

public class sample7 
{

	//Integer to String
	
	public static void main(String[] args) {
		
		
		int a=112233;
		String AA = Integer.toString(a);
		
		String BB="";
		for(int i=AA.length()-1 ; i>=0 ; i--)
		{
			BB=BB+ AA.charAt(i);
		}
		
		int CC = Integer.parseInt(BB);
		
		System.out.println(CC);
		
	}
}
