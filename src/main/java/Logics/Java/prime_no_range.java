package Logics.Java;

import java.util.Scanner;

public class prime_no_range  /*a number that is divisible only by itself and 1 (e.g. 2, 3, 5, 7, 11).*/
{
	public static void main(String[] args) {
		int i;
		System.out.println("Enter number from");
		Scanner sc = new Scanner(System.in);
		   int from = sc.nextInt();
		System.out.println("Enter number to");
		   int to =sc.nextInt();
		   for(i=from;i<to;i++)
		   {
			   if(to%i==0)
			   {
				   System.out.println("not prime");
				   break;
			   }
		   } if(to==i)
		   {
			   System.out.println("Prime");
		   }
	}

}
