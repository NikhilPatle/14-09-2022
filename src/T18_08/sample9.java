package T18_08;

import java.util.Scanner;

public class sample9 
{
//Amstrong Number
	public static void main(String[] args)
	{
	Scanner s1= new Scanner(System.in);
	System.out.println("Enter the Number");
	int num = s1.nextInt();
	int num2=0;
	
	for(int i=num ; i>0; i=i/10)
	{
		int reminder = i%10;
		
		num2=num2+(reminder*reminder*reminder);
	}
//	System.out.println(num2);
	
	
	if(num==num2)
	{
		
		System.out.println("Its a Amstrong Number");
	}
	else
	{
		System.out.println("Its a not Amstrong Number");
	}
	
	}
	
}
