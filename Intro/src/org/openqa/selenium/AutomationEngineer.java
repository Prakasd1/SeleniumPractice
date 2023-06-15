package org.openqa.selenium;

public class AutomationEngineer extends Employee {
	
	AutomationEngineer(String name, int empid)
	{
		this.name = name;
		this.empid = empid;
		
		
	}
	/*public void script()
	{
		System.out.println("Running the test Script");
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testEngineer te = new testEngineer("rani" , 78765);
		te.display();
		
		AutomationEngineer ae = new AutomationEngineer("prakash" , 765876);
		ae.display();
		//ae.script();

	}

}
