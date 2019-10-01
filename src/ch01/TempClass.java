package ch01;

import java.util.Arrays;

public class TempClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float tmpFloat = 10.5F;
		double tmpDouble =15.5;
		
		char char_a ='a';
		char char_b = 'b';
		
		int xor_char = (char_a ^ char_b); 
		
		System.out.println(" " + xor_char);
		
          xor_char = (xor_char ^ char_a); 
		
		System.out.println(" " + xor_char);
		
        xor_char = (xor_char ^ char_a); 
		
		System.out.println(" " + xor_char);
		
		int [] charMap = new int[256];
		
		System.out.println(charMap[20]);
		
		
		String testSTring ="This is a Test Input String for Reversing";
		
		String [] testArr = testSTring.split("[ ]+");
		
		int i = testArr.length -1;
		while ( i >-1)
		{
			System.out.print(testArr[i] +" ");
			i--;
		}
		System.out.println("\n");

  	
	
	}
	

}
