package ch01;

class myStack{
	private  char [] data;
	private int dataPointer;
	
	
	myStack ()
	{
		data = new char [1000];
		dataPointer =0;
	}
	
	
	void push(char value)
	{
		data[dataPointer++] = value;
	}
	
	char pop()
	{
		if(dataPointer>=0)
		{
			return data[--dataPointer];
			
		}
		else
			return 'X';
	
	}
	
	 int size()
	{
		 return dataPointer;
		
	}
}


public class CheckBalancedBrackets {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		String bracketString ="{()}{";
		
		System.out.println(checkBalance(bracketString));
		
		
		
	}

	private static String checkBalance(String bracketString) {
		
		
		myStack stack = new myStack();
		
		String returnValue= "Not Balanced";
		// Loop over String 
		// Push opening bracket. 
		// bre
		
		char [] inputArr = bracketString.toCharArray();
		
		for (int i = 0; i < inputArr.length; i++) {
			
			
			// Push Opening Bracket to Stack
			
			if (inputArr[i] == '{' || inputArr[i] == '(' || inputArr[i] == '[') {

				stack.push(inputArr[i]);
				System.out.println("Pushing into stack:: " + inputArr[i]);

			} else if (inputArr[i] == '}' || inputArr[i] == ')' || inputArr[i] == ']') {
				System.out.println("Found ::" + inputArr[i]);

				if (stack.size() == 0) { // Closing bracket found and there was no opening bracket in the stack
					break;
				}

				char ch = stack.pop();
				System.out.println("Popped::" + ch);

				if (!((inputArr[i] == '}' && ch == '{') || (inputArr[i] == ')' && ch == '(')
						|| (inputArr[i] == ']' && ch == '['))) {
					System.out.println("Pushing into Stack::");
					stack.push(ch);
					stack.push(inputArr[i]);
				}else
				{
					System.out.println("Bracket MAtch");
				}

			}

		}
		
		if(stack.size() ==0)
		{
			returnValue= "Balanced";
		}
		
		for(int i=0; i<stack.size() ; i++)
		{
			System.out.printf("%c\n", stack.pop());
		}
		
		
		return returnValue;
	}

}
