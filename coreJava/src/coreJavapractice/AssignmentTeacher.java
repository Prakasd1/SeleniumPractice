package coreJavapractice;

class Teacher{

String designation = "Teacher";
String collagename = "BegineersBook";

void does()
{
	System.out.println("Teaching.........");
}
}


class ComputerTeacher extends Teacher 
{

}

public class AssignmentTeacher {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ComputerTeacher ct = new ComputerTeacher();
		System.out.println(ct.designation);
		System.out.println(ct.collagename);
		ct.does();
		
		

	}

	}
