package coreJavapractice;

public class AssignmentMethod {
	
	
	int sid;
	String sname;
	 int sub1,sub2,sub3;
	 
	 void getStuData(int x, String y)
	 {
		 sid = x;
		 sname = y;
	 }
	 
	 void getStuMarks(int mark1, int mark2, int mark3)
	 {
		 
		 sub1= mark1;
		 sub2= mark2;
		 sub3= mark3;
		 
		
		 
		 
	 }
	 
	 void totalmarks()
	 {
		 int sum = sub1+sub2+sub3;
		 System.out.println(sid+"   "+sname+"    "+(sum));
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AssignmentMethod am = new AssignmentMethod();
		am.getStuData(1010, "Prakas");
		am.getStuMarks(70, 75, 73);
		am.totalmarks();
		
		
		 

	}

}

