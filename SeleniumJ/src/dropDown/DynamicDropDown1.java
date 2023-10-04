package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement from=driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']"));
		from.click();
		Thread.sleep(3000);
		
	    WebElement bang=driver.findElement(By.xpath("//a[@value='BLR']"));
		bang.click();
		Thread.sleep(2000);
		
		WebElement jai=driver.findElement(By.xpath("(//a[@value='JAI'])[2]"));
		jai.click();
		Thread.sleep(2000);

		
	}

}
