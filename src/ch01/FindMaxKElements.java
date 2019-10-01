package ch01;

public class FindMaxKElements {
	
	
	
	public static void main(String [] args)
	{
		int [] inputArr1 = {39, 45,2, 44,9,14,459, 109,11,7};
		int [] inputArr2= {39, 45,2, 44,9,14,459, 109,11,7};
		int [] inputArr3 = {39, 45,2, 44,9,14,459, 109,11,7};
		
		printMaxElements(inputArr1, 3);
		printMaxElements(inputArr2, 4);
		
		printMaxElements(inputArr3, 6);
		
		
		
		
	}

	private static void printMaxElements(int[] inputArr, int numOfMaxElements) {
		
		
		int inputLen= inputArr.length;
		
		for(int i=0; i<inputLen ;i++)
		{
			System.out.print(inputArr[i] + " ");
		}
		System.out.println("");

		
		int tmp=-999999999;

		for(int i=0; i < numOfMaxElements; i++)
		{
			
			
			for(int j= numOfMaxElements; j<inputLen; j++)
			{
				if(inputArr[j] > inputArr[i])
				{
					tmp=inputArr[i];
					inputArr[i]=inputArr[j];
					inputArr[j]=tmp;  
				}
			}
			
			
		}
		
		

		for(int i=0; i<inputLen ;i++)
		{
			System.out.print(inputArr[i] + " ");
		}
		System.out.println("");
		
		
		
		
	}
	

}
