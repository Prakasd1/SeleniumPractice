package org.openqa.selenium;

public class Ocean extends country {
	
	Ocean(String city, int state)
	{
		//this.city = city;
		//this.state = state;
		System.out.println("There are various ocean");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ocean o = new Ocean("bbsr" , 23);
		o.display();

	}

}
