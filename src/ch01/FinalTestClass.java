package ch01;

public final class FinalTestClass {
	public static final int i;
	
	private String s ="a";
	
	static {
		i=0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalTestClass fclass = new FinalTestClass();
		
		fclass.s="Terp";
		
		System.out.println("hello");
		System.out.println(fclass.s);

	}

}
