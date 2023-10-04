package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCssSelector {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.xpath("//inputs[@type='email']"));
		username.click();
		username.sendKeys("mayur");
		
		//WebElement password=driver.findElement(By.xpath("//inputs[@id=password]"));
		//password.click();
		//password.sendKeys("bhusari");
		
		//WebElement Login=driver.findElement(By.cssSelector("//inputs[@id=Login]"));
		//Login.click();
		//Thread.sleep(3000);
		//driver.navigate().refresh();
		
		//WebElement forgat=driver.findElement(By.cssSelector("//inputs[@id=forgat_password_link]"));
		//forgat.click();
		
	}

}
