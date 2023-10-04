package demo;

import org.testng.annotations.Test;

public class A {
	@Test(priority=3)
	public void m1()
	{
		System.out.println(" i m method m1");
	}

	@Test(priority=2)
	public void m2()
	{
		System.out.println("i m method m2");
	}
	
	@Test(priority=1)
	public void m3()
	{
		System.out.println("i m method m3");
	}
}
