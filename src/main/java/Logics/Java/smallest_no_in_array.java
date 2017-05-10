package Logics.Java;

public class smallest_no_in_array {
public static void main(String args[])
{
	int array[]={2,3,5,8,6,5,0};
	int small=array[0];
	for(int i=0;i<=array.length-1;i++)
	{
		if(array[i]<small)
		{
			small=array[i];
		}
	}
	System.out.println(small);
	}
}
