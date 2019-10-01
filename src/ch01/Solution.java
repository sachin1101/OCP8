package ch01;

import java.util.*;
import java.io.*;

//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {
	
	
	public static void main(String [] args)
	{
		
		int [] arr = { 1 ,4 ,5, 8, 6 ,7, 4 ,5, 1,7, 8, 6, 9 };
		
		System.out.println(solution(arr));
		
		
	}
 public static int solution(int[] A) {
     // write your code in Java SE 8

     
     int updatedIndentifier=-1;
     boolean matchFound=false;
     int returnValue=-1;
     for(int i=0; i <A.length; i++)
     {
    	// System.out.printf("\ni=%d, A[i]=%d\n",i, A[i] );
         matchFound=false;
         
         if(A[i]==updatedIndentifier)
         {
             continue;
         }
         
         for(int j=i +1 ; j<A.length; j++)
         {
        	// System.out.printf("\n     i=%d, j=%d A[i]=%d, A[j]=%d\n",i,j, A[i] ,A[j]);
             if(A[j]==A[i])
             {
            	 System.out.printf("\n     matchFound\n");
               matchFound=true;  
               A[j]=updatedIndentifier;
               A[i]=updatedIndentifier;
               break;
             }
             
             
         }
         
         if(!matchFound)
         {
        	 //System.out.printf("\n     match NotFound\n");
             returnValue=A[i];
             break;
         }
         
         
         
     }
     
     return returnValue;
 }
}
