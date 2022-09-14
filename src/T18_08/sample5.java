package T18_08;

import java.util.Scanner;

public class sample5 
{
//ODD EVEN
	public static void main(String[] args) {
		
	
	Scanner s1= new Scanner(System.in);
	System.out.println("Enter the number");
	int num=s1.nextInt();
	
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