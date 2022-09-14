package T15_08;

import java.util.Scanner;

public class example6 
{

	public static void main(String[] args) 
	{
	
		//Odd Even Number
		
		Scanner s1= new Scanner(System.in);
		System.out.println("Enteer the number");
		int num = s1.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
			
		}
		
	}
}
