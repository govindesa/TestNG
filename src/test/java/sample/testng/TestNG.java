package sample.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG {
	@BeforeSuite
	public void beforesiute() {
		System.out.println("Before suite");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before class");
	}
	@BeforeMethod
	public void beforesmethod() {
		System.out.println("Before method");
	}
	@Test
	public void testmethod() {
		System.out.println("Test method");
	}
	@AfterMethod
	public void Aftermethod() {
		System.out.println("After method");
	}
	@AfterClass
	public void AfterClass() {
		System.out.println("After Class");
	}
	@AfterSuite
	public void AfterSuite() {
		System.out.println("AfterSuite");
	}

}
