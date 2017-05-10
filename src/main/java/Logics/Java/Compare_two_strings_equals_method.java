package Logics.Java;

import java.util.Scanner;

public class Compare_two_strings_equals_method {

	public static void main(String args[])
	{
		System.out.println("Enter first string");
		Scanner sc = new Scanner(System.in);
		String first_string =sc.next();
		System.out.println("Enter Second String");
		String Second_string=sc.next();
		if(first_string.equalsIgnoreCase(Second_string))
		{
			System.out.println("Two Strings are matched");
		}
		else
		{
			System.out.println("Strings are not matched");
		}
	}
}
