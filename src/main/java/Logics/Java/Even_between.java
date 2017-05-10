package Logics.Java;

import java.util.Scanner;

public class Even_between {
	public static void main(String args[])
	{
		System.out.println("Enter from number");
		  Scanner sc = new Scanner(System.in);
		  int from = sc.nextInt();
		System.out.println("Enter to number");
		  int to =sc.nextInt();
		  for(int value=from;value<=to;value++)
		  {
			  if(value%2==0)
			  {
				  System.out.println(value);
			  }
		  }
	}
}