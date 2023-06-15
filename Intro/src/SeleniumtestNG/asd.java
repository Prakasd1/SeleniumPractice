package SeleniumtestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class asd {
	
	@Test
	public void method() {
		System.out.println("I am here");
	}
	
	@BeforeClass
	public void test() {
		System.out.println("I am bfrclass method");
	}
	@BeforeMethod
	public void test1() {
		System.out.println("I am bfr method");
	}
	@BeforeSuite
	public void test2() {
		System.out.println("I am bfr suite method");
	}

}
