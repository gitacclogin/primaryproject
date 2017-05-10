package Logics.Java;

public class Char_count {

	public static void main(String[] args) {
	String s ="Java=vb-";
	int count=0;
	for(int i=0;i<s.length();i++)
	{
	Character ch=s.charAt(i);
	if(Character.isLetter(ch))
	count++;

	
	}
	System.out.println(count);
	}
}
