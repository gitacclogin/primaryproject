package Logics.Java;

public class Large_small_in_array {

	public static void main(String[] args) {
		int array[]={2,6,11,21,4,7,1,48,3,67,8,6,0,5};
		int small =array[0];
		int large =array[0];
		for(int i=0;i<=array.length-1;i++)
		    {
				if(array[i]>large)
					large=array[i];
				else if(array[i]<small)
					small=array[i];
		    }
		System.out.println("Large number"+large);
		System.out.println("Small number"+small);
	}
}