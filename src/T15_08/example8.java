package T15_08;

public class example8
{

	public static void main(String[] args)
	{
	
		int s1 =112233;
		
		String s2 = Integer.toString(s1);
		
		String Rev= "";
		
		for(int i=s2.length()-1 ; i>=0 ; i--)
		{
			Rev = Rev + s2.charAt(i);
		}
		
		int SS = Integer.parseInt(Rev);
		
		System.out.println(SS);
		
	}
}
