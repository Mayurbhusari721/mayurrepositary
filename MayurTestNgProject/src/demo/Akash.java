package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Akash
{
static WebDriver driver;

@BeforeClass()

	public void enterUrl()
	{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	}

@AfterClass
    public void closeBrowser()
    {
     driver.close();
    }
@Test
    public void login() throws InterruptedException
    {
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	System.out.println(driver.getCurrentUrl());
    }




}