package Logics.Java;

public class prime_numbers  /*a number that is divisible only by itself and 1 (e.g. 2, 3, 5, 7, 11).*/
{
	public static void main(String[] args) 
	{
	int number=7, i;
	  for(i=2;i<number;i++)
	  {
	  if(number%i==0)
	  {
	  System.out.println(number+" is not Prime");
	  break;
	  }
	  }
	 if(number==i)
	 {
	 System.out.println(number+" is Prime");
	 }
	}
	}

