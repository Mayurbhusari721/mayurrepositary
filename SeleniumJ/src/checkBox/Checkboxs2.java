package checkBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxs2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	   WebElement a1=driver.findElement(By.xpath("//input[@value='RC']"));
	    a1.click();
	    System.out.println(a1.isDisplayed());
	    System.out.println(a1.isEnabled());
	    System.out.println(a1.isSelected());
	    Thread.sleep(1000);
	    
	    WebElement a2=driver.findElement(By.xpath("//input[@value='Selenium IDE']"));
	    a2.click();
	    System.out.println(a2.isDisplayed());
	    System.out.println(a2.isEnabled());
	    System.out.println(a2.isSelected());
	    Thread.sleep(1000);
	    
	    WebElement a3=driver.findElement(By.xpath("//input[@value='Selenium Webdriver']"));
	    a3.click();
	    System.out.println(a2.isDisplayed());
	    System.out.println(a2.isEnabled());
	    System.out.println(a2.isSelected());
	    Thread.sleep(1000);
	    
	    List<WebElement> a4=driver.findElements(By.xpath("//input[@type='checkbox']"));
	    
	    		for(int i=0; i<a4.size(); i++)
	    		{
	    			a4.get(i).click();
	    		}
	    
	    
	    
	    
		
			}

}
