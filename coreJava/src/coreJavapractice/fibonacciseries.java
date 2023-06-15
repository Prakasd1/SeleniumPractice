package coreJavapractice;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
		int b = 1;
		int c, count=10;
		
		System.out.print(a +" "+" "+b);
		System.out.print("\t");
		
				
		for (int i=2;i<count;++i)
		{
			c=a+b;
			System.out.print(""+c);
			System.out.print("\t");
			a=b;
			b=c;
		}
		
		

	}

}
