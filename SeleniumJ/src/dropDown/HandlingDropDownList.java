package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownList {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement continents=driver.findElement(By.xpath("//select[@name='continents']"));
	// continents.click();
	Select s=new Select(continents);
	s.selectByIndex(2);
	Thread.sleep(3000);
	s.selectByVisibleText("Antartica");
	
	
	
		
		
	}

}
