package Logics.Java;

import java.util.Scanner;

public class Even_nums 
{
	public static void main(String args[])
		{
		System.out.println("Enter a number");
		  Scanner sc = new Scanner(System.in);
		  int Number=sc.nextInt();
		    if(Number%2==0)
		    	{
		    	System.out.println("Given number is Even");
		    	}
		    else
		    	{
		    	System.out.println("Given number   odd");
		    	}
		}
}
