package Logics.Java;

public class Largest_no_in_array {

	public static void main(String[] args) {
		int array[]={2,6,11,21,4,7,1};
		int large=array[0];
		for(int i=0;i<=array.length-1;i++)
		 {
			if(array[i]>large)
			{
				large=array[i];
			}
		 }System.out.println(large);
	}

}
