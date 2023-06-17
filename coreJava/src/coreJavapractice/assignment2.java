package coreJavapractice;

public class assignment2 {
	
	void sum(int x, int y)
	{
		System.out.println(x+y);
	}
	void sum(int x, int y, int z)
	{
		System.out.println(x+y+z);
	}
	void sum(double x, double y)
	{
		System.out.println(x+y);
	}
	void sum(double x, double y, double z)
	{
		System.out.println(x+y+z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		assignment2 as= new assignment2();
		as.sum(10, 20);
		as.sum(10, 20, 30);
		as.sum(10.5, 20.5);
		as.sum(10.5, 20.5, 30.5);

	}

}
