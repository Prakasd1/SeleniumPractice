package coreJavapractice;

/*interface A
{
	int a = 10;
	int b = 20;
	
	default void sum()
	{
		System.out.println(a+b);
	}
}*/

interface A
{
	int a = 10;
	int b = 20;
	
	default void add ()
	{
		System.out.println(a+b);
	}
}

interface B
{
	int x= 10;
	int y = 20;
	 default void mul()
	 {
		 System.out.println(x*y);
	 }
}



public class AssignmentInheritance  implements  A, B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssignmentInheritance as = new AssignmentInheritance();
		as.mul();
		as.add();
	}

}
