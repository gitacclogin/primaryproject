package Logics.Java;

import java.util.Scanner;

public class array_even {

	public static void main(String[] args) {
		int array[]=new int[50];
		System.out.println("Enter an array size");
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter elements");
		 for(int i=0;i<size;i++)
		 {
			 array[i]=sc.nextInt();
			   if(array[i]%2==0)
			   {System.out.println("Even are"+array[i]);}
		 }
		 
	}

}
