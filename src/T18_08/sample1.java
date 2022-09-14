package T18_08;

import java.util.Scanner;

public class sample1 
{

	public static void main(String[] args) 
	{
	
		//Accept User Inputs
		
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the 1st Number");
		int num1 = s1.nextInt();
		System.out.println("Enter the 2nd Number");
		int num2= s1.nextInt();
		
		System.out.println(num1+num2);
	}
}
