package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement From=driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']"));
		From.click();
		Thread.sleep(3000);
		
	   WebElement channai=driver.findElement(By.xpath("//a[@value='MAA']"));
	   channai.click();
	   Thread.sleep(2000);
	 
	   WebElement goa=driver.findElement(By.xpath("(//a[@text='Goa (GOI)'])[2]"));
	   goa.click();
	}

}
