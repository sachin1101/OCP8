package ch01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Array2DPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] data = {{1,2,3,4}, 
				         {5,6,7,8},
				         {9,10,11,12}, 
				         {13,14,15,16},
				         {17,18,19,20},
				         {21,22,23,24,25,26}
				        };
		
		
		print2DArrayLength(data);
		printCornerElements(data);
		printDiagonalElements(data);
		
		String testString="Test";
		
		

		
		
	}

	private static void printDiagonalElements(int[][] data) {
	
		StringBuilder sb = new StringBuilder();

		
		if(data!=null)
		{
			int i=0, j=0;
			
			for(; i<data.length && data[i]!=null ; i++, j++)
			{
				try {
				
					if(j<data[i].length)
					{
					
						System.out.println(sb.toString() + data[i][j]);
					}else
					{
						System.out.println(sb.toString() +" ");
					}
					sb.append(" ");
				}catch(Exception e)
				{
					e.printStackTrace();
				}
				
				
					
					
			}
			
			
			
		}
		
		
	}

	private static void printCornerElements(int[][] data) {
		
		System.out.printf("data.length=%d\n" , data.length);
		
		if(data!=null)
		{
			if(data[0]!=null )
			{
				System.out.println(data[0][0] + "----" + data[0][data[0].length -1]);
				
				
			}
			
			if(data[data.length -1]!=null )
			{
				System.out.println(data[data.length -1][0] + "----" + data[data.length -1][data[data.length -1].length -1]);
				
				
			}
			
		}
		
		
		
	}

	private static void print2DArrayLength(int[][] data) {
		
		int i=0;
		for(int [] row : data)
		{
			System.out.printf("Row [%d] Length =%d\n", i , row.length);
			i++;
		}
		
	}

}
