package demo;

import org.testng.annotations.Test;

public class Groups {
	@Test(groups="regrassion")
	public void m1()
	{
		System.out.println(" i m method m1");
	}

	@Test(groups="smoke")
	public void m2()
	{
		System.out.println("i m method m2");
	}
	
	@Test(groups="smoke")
	public void m3()
	{
		System.out.println("i m method m3");
	}


}
