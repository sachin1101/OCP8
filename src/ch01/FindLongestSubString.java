package ch01;

public class FindLongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputString = "abcbbbbcccbdddadacb";
		
		System.out.println(findLongestString(inputString));

	}

	private static String findLongestString(String inputString) {

		String longestSubString="";
		
		
		
		char [] inputStringCharArray= inputString.toCharArray();
		
		char [] trackers = {inputStringCharArray[0], inputStringCharArray[1]};
		
		int subStringLen=2;
		boolean isStringContinues= true;
		int lastIndex= 0; 
		int lastMaxSubStringLen=0;
		String lastMaxSubString="";
		
		
		
		for(int i =2 ; i <inputStringCharArray.length ; i++)
		{
		
			if(inputStringCharArray[i] == trackers[1] || inputStringCharArray[i] ==trackers[0] )
			{
				subStringLen++;
				
			}else
			{
				lastIndex = i-1;
				isStringContinues=false;
				
				if(subStringLen >lastMaxSubStringLen )
				{
					lastMaxSubStringLen=subStringLen;
					lastMaxSubString = new String(inputStringCharArray, (i-subStringLen), subStringLen);
					
					subStringLen=0;
					
				}

				if(inputStringCharArray[i] != trackers[0] )
				{
					trackers[0]= inputStringCharArray[i];
				}else if(inputStringCharArray[i] != trackers[1] )
				{
					trackers[1]= inputStringCharArray[i];
				}
				
			}
		}
		
		
		
		return longestSubString;
	}

}
