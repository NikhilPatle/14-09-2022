package T18_08;

import java.util.Scanner;

public class sample6
{

	public static void main(String[] args) {
		//Factorial
		
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s1.nextInt();
		
		int num1=1;
		
		for(int i=num ;i>0 ; i--)
		{
			num1=num1*i;
		}
		System.out.println(num1);
	}
}
