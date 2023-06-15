package org.openqa.selenium;

public class indianTraffic implements centralTrafic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		centralTrafic ct = new indianTraffic();
		ct.greenGo();
		ct.flasingyellow();
		ct.redStop();
		indianTraffic it= new indianTraffic();
		//System.out.print(it.greenGo());
	}
	
	
	
	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
	System.out.println("we should be go when green ");
	
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("we should be stop when red");
		
		
	}

	@Override
	public void flasingyellow() {
		// TODO Auto-generated method stub
		
	}

}
