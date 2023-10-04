package checkBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxs1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement mayur=driver.findElement(By.xpath("(//input[@name='profession'])[1]"));
		mayur.click();
		System.out.println(mayur.isDisplayed());
		System.out.println(mayur.isEnabled());
		System.out.println(mayur.isSelected());
		Thread.sleep(2000);
		
		WebElement mayur1=driver.findElement(By.xpath("(//input[@name='profession'])[2]"));
		mayur1.click();
		System.out.println(mayur1.isDisplayed());
		System.out.println(mayur1.isEnabled());
		System.out.println(mayur1.isSelected());
		Thread.sleep(2000);
		
		WebElement mayur2=driver.findElement(By.xpath("//input[@value='RC']"));
	    mayur2.click();
	    System.out.println(mayur2.isDisplayed());
	    System.out.println(mayur2.isEnabled());
	    System.out.println(mayur2.isSelected());
	    Thread.sleep(1000);
	    
	    WebElement mayur3=driver.findElement(By.xpath("//input[@value='Selenium IDE']"));
	    mayur3.click();
	    System.out.println(mayur3.isDisplayed());
	    System.out.println(mayur3.isEnabled());
	    System.out.println(mayur3.isSelected());
	    Thread.sleep(1000);
	    
	    WebElement mayur4=driver.findElement(By.xpath("//input[@value='Selenium Webdriver']"));
	    mayur4.click();
	    System.out.println(mayur4.isDisplayed());
	    System.out.println(mayur4.isEnabled());
	    System.out.println(mayur4.isSelected());
	    Thread.sleep(1000);
	    
	    List<WebElement> a4=driver.findElements(By.xpath("//input[@type='checkbox']"));
	    
		for(int i=0; i<a4.size(); i++)
		{
			a4.get(i).click();
		}
		
		
	}

}
