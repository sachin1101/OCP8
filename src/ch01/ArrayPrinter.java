package ch01;

public class ArrayPrinter {

	public static void main(String[] args) {
		
		
		int [] values = {1,2,3,4,5,6,8,9,12};
		
		
		printValues(values);
		

	}

	private static void printValues(int[] values) {
		
		for(int i=0; i<values.length; i++)
		{
			System.out.printf("values[%d]=%d\n", i,values[i]);
		}
		
	}

}
