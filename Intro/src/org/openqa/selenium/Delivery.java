package org.openqa.selenium;

public class Delivery extends OrderStatus {
	
	public void delivered()
		{
		System.out.println("Your order delivered successfully");
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Delivery d= new Delivery();
		d.firstorder();
		d.shipping();
		d.packing();
		d.delivered();


	}

}  
