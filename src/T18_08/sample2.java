package T18_08;

import java.util.Arrays;

public class sample2 
{

	//compare two array
	
	
	public static void main(String[] args) {
		
		int ar1[]= {10,20,30,40};
		int ar2[]= {10,20,30,40};
		int ar3[]= {50,30,40,80};
		
		System.out.println(Arrays.equals(ar1, ar2));
		System.out.println(Arrays.equals(ar1, ar3));
		
	}
}
