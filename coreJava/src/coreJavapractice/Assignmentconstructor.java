package coreJavapractice;

public class Assignmentconstructor {
	int a, b, c;
	
	Assignmentconstructor()
	{
		a= 20;
		b=30;
		c=40;
			
		
	}
	
	void sum()
	{
		System.out.println(a+b+c);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignmentconstructor ac = new Assignmentconstructor();
		ac.sum();

	}

}
