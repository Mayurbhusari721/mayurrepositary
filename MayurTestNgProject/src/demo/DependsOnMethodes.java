package demo;

import org.testng.annotations.Test;

public class DependsOnMethodes {
	@Test(dependsOnMethods="m3")
	public void m1()
	{
		System.out.println(" i m method m1");
	}

	@Test
	public void m2()
	{
		System.out.println("i m method m2");
	}
	
	@Test
	public void m3()
	{
		System.out.println("i m method m3");
	}

	
	

}
