package T15_08;

import java.util.Arrays;

public class example1 
{

	public static void main(String[] args) {
		
		
		int ar[] = new int [3];
		ar[0]=70;
		ar[1]=20;
		ar[2]=50;
		
		System.out.println(ar[1]);
		
		
//		for(int AA:ar)
//		{
//			System.out.println(AA);
//		}
		
		Arrays.sort(ar);
		for(int i =0 ; i<=ar.length-1 ; i++)
		{
			System.out.println(ar[i]);
		}
		
		
		
		
	}
}
