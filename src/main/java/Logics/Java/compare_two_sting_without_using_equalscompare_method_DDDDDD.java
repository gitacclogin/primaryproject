package Logics.Java;

import java.util.Scanner;

public class compare_two_sting_without_using_equalscompare_method_DDDDDD {
public static void main(String args[])
 {
	System.out.println("Enter first string");
	Scanner sc = new Scanner(System.in);
	String First_String=sc.next();
	System.out.println("Enter second string");
	String Second_String=sc.next();
	First_String =First_String.toLowerCase();
	Second_String=Second_String.toLowerCase();
	if(First_String!=Second_String)
	 {
		System.out.println("Strings are not equal");
	 }
 }
}
