package Logics.Java;

import java.util.Scanner;

public class word_count {
	public static void main(String[] args) {	
			String text;
			int wordcount =1;
			System.out.println("Enter a string :");
			Scanner SC=new Scanner(System.in);
			text =SC.nextLine();
			for (int i=0;i<text.length();i++)
			{
				if(text.charAt(i)=='/')
				{
					wordcount++;
				}
				
			}System.out.println("No.of words are:"+wordcount);
	}
	}