package org.openqa.selenium;

public class OrderStatus extends Flipcart {
	
	public void packing()
	{
		System.out.println("Order packed successfully");
		
	}
	public void shipping()
	{
		System.out.println("Order shipped successfully");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Flipcart f = new Flipcart();
		f.firstorder();

	}

}
