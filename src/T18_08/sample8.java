package T18_08;

public class sample8 
{

	public static void main(String[] args)
	{
	
		String AA = "a d fvld f  dld dld kk xl  ldm cll c";
		int Count= 0;
		
		for(int i=0 ; i<=AA.length()-1 ; i++)
		{
			
			char BB = AA.charAt(i);
			
			if(BB==' ')
			{
				Count++;
				
			}
		}
		System.out.println(Count);
	}
}
