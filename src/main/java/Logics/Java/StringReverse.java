package Logics.Java;

public class StringReverse {
	
	public static void main (String args[])
	{
		String s= "AVAJ";
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}

}
