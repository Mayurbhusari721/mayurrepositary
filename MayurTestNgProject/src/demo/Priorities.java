package demo;

import org.testng.annotations.Test;

public class Priorities {
	@Test(priority='z')
	public void m1()
	{
		System.out.println(" i m method m1");
	}

	@Test(priority='j')
	public void m2()
	{
		System.out.println("i m method m2");
	}
	
	@Test(priority='x')
	public void m3()
	{
		System.out.println("i m method m3");
	}

}
