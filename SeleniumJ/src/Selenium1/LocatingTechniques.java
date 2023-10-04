package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingTechniques {
	public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://login.salesforce.com/");
			Thread.sleep(3000);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
			username.click();
			username.sendKeys("mayur");
			
			WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
			password.click();
			password.sendKeys("mayur@123");
			
			WebElement Login=driver.findElement(By.cssSelector("input[id='Login']"));
			Login.click();
			Thread.sleep(3000);
			driver.navigate().refresh();
			
			
			WebElement forgat=driver.findElement(By.cssSelector("a[id='forgot_password_link']"));
			forgat.click();
	
			
			
			
	}

}
