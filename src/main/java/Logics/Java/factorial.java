package Logics.Java;

public class factorial  /*factorial of 4! = 4*3*2*1 = 24||factorial of 5! = 5*4*3*2*1 = 120*/  
{
public static void main (String args[])
{  
		  int fact=1,number=4;    
		  for(int i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }    
}
