package Logics.Java;

public class Divide_upper_lower {
public static void main(String[]args)
{
	String s= "JaVa-seleNIUM";
	String Captial="";
	String Small="";
	
	for(int i=0;i<s.length();i++)
	{
         Character ch =s.charAt(i);
         if(ch.isUpperCase(ch))
         {
        	 Captial=Captial+s.charAt(i)+" ";
         }
         else if(ch.isLowerCase(ch))
         {
        	 Small=Small+s.charAt(i)+" ";
         }
        	 
	}
	 System.out.print(Captial);
	 System.out.println();
	 System.out.print(Small);
	}
}
