package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
	WebElement e=driver.findElement(By.id("username"));
	e.clear();
	e.sendKeys("mayur.bhusari");
	Thread.sleep(2000);
	WebElement e1=driver.findElement(By.id("password"));
	e1.clear();
	e1.sendKeys("Mayur@123");
	driver.quit();

	
	
		
	}

}
