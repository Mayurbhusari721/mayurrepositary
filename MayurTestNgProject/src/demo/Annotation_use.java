package demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_use {
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("this code will execute before the class");
	}

	@AfterClass
	public void afterclass() 
	{
		System.out.println("this code will execute after every class");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("this code will execute before the every @Test method");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("this code will execute after the every @Test method");
	}
	
	@Test
	public void m1()
	{
		System.out.println("this is first method");
	}
	
	
}
