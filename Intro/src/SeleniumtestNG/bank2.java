package SeleniumtestNG;

import org.testng.annotations.Test;

public class bank2 {
	
	@Test
	public void creditcard()
	{
		System.out.println("creditCard login");
	}
	
	@Test(groups= {"Smoke"})
	public void debitcard()
	{
		System.out.println("debitCard login");
	}
}
