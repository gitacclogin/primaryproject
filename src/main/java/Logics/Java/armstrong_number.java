package Logics.Java;

public class armstrong_number/* Armstrong number is a number that is equal
							   to the sum of cubes of its digits.
							  For example 0, 1, 153, 370, 371, 407 etc.*/
{
public void main(String[] args)
{	
int number=153,a,b=0,temp;  
temp=number;  
while(number>0)  
{  
a=number%10;  
number=number/10;  
b=b+(a*a*a);  
}  
if(temp==b)  
System.out.println("armstrong number");   
else  
    System.out.println("Not armstrong number");   

	}
}
