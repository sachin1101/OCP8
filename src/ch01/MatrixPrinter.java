package ch01;

public class MatrixPrinter {

	public static void main(String[] args) {

		
		int m=4, n=4;
		int [][] arr = { {1,2,3,4},
				         {5,6,7,8},
				         {9,10,11,12},
				         {13,14,15,16}
				        };
		
		printSpiral(m, n, arr);
		
		
		 m=3; n=6;
		 
		int [][] arr2 = {{1,2,3,4, 5,6},
				         {7,8,9,10,11,12},
				         {13,14,15,16,17,18}
				         //,{19,20,21,22,23,24}
				        };
		System.out.println("---");
		
		printSpiral(m, n, arr2);
		
		System.out.println("---");
		printSpiral3(m, n, arr2);
		
		
	}

	private static void printSpiral(int m, int n, int[][] arr) {
		int midM = m/2 + (m%2);
		int midN = n/2 + (n%2);
		
		int totalElements=m*n;
		
		
		for(int mEnd =0 , nEnd =0, rowIndx =0 , colIndx=0 ; mEnd <midM && nEnd <midN ; mEnd ++, nEnd++ )
		{
			
			
			for(;colIndx< (n - nEnd) && totalElements>0; colIndx++) // print row
			{
				System.out.print(arr[rowIndx][colIndx] + " ");
				totalElements--;
			}
			
			rowIndx++; colIndx--;
			for(;rowIndx< (m -mEnd) && totalElements>0; rowIndx++) // print column
			{
				System.out.print(arr[rowIndx][colIndx] + " ");
				totalElements--;
			}
			
			colIndx--; rowIndx--;
			
			for(;colIndx >nEnd && totalElements>0; colIndx--) // print reverse row
			{
				
				System.out.print(arr[rowIndx][colIndx] + " ");
				totalElements--;
			}
			
			//i--;
			for(;rowIndx >mEnd && totalElements>0; rowIndx--) // print reverse column
			{
				System.out.print(arr[rowIndx][colIndx] + " ");
				totalElements--;
			}
			rowIndx++;
			colIndx++;
		}
	}

	private static void printSpiral3(int m, int n, int[][] arr) {
		
		
		
		int activeRowStart=0,activeRowEnd=m , activeColumnStart=0, activeColumnEnd=n;
		
		int i =0, j=0;
		while (activeRowEnd > activeRowStart &&  activeColumnEnd >activeColumnStart  )
		{
			//print row
			
			 
			 for(i=activeRowStart, j=activeColumnStart; j <activeColumnEnd; j++) {
				 
				 System.out.print(arr[i][j] + " ");
			 }
			 activeRowStart++;
			 
			// System.out.println("After Row");
			//print col
			 
			 for(i=activeRowStart, j=activeColumnEnd -1; i <activeRowEnd; i++)
			 {
				 System.out.print(arr[i][j] + " ");
			 }
			 
			 activeColumnEnd--;
			 
			 //System.out.println("After Col");
			 
			//print reverse row
			 
			 for(i=activeRowEnd -1, j=activeColumnEnd -1; j>=activeColumnStart && activeRowEnd > activeRowStart; j--)
			 {
				// System.out.print("|i=" + i +",j=" + j +"|");
				 System.out.print(arr[i][j] + " ");
			 }
			 
			 activeRowEnd--;
			 //activeColumnEnd--;
			 
		//	 System.out.println("After Rev Row");
			 
			//print reverse col
			 for(i=activeRowEnd -1, j=activeColumnStart; i >=activeRowStart ;i--)
			 {
				 //System.out.print("|i=" + i +",j=" + j +"|");
				 System.out.print(arr[i][j] + " ");
			 }
			 
			// System.out.println("After Rev Col");
			 activeColumnStart++;
			 
			
		}
		
		
		
	}

}
