package ch01;



class Student implements Cloneable {
	
	String name;
	
	public Student(String name)
	{
		this.name=name;
		
	}
	
	public String getStudentName(String name)
	{
		return name;
	}
	
	public Student(Student inputStudent)
	{
		this.name=inputStudent.name;
		
	}
	
	
	protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}


public class ObjectCopyTest {

	
	public static void main(String args[]) throws CloneNotSupportedException
	{
		System.out.println("heelo");
		
		Student s1 = new Student("Student 1");
		Student s2 = new Student("Student 2") ;
		
		Student s3 = new Student(s1);
		
		Student s4 = (Student) s2.clone();
		
		System.out.println("Student 1 name::" + s1.name);
		
		System.out.println("Student 2 name::" + s2.name);
		System.out.println("Student 3 name::" + s3.name);
		System.out.println("Student 4 name::" + s4.name);
		
		
		
		
		
		
		
		
		
		
	}
}
