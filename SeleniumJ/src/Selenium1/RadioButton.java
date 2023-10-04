package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		WebElement radio1=driver.findElement(By.xpath("//input[@value='radio1']"));
		WebElement radio2=driver.findElement(By.xpath("//input[@value='radio2']"));
		WebElement radio3=driver.findElement(By.xpath("//input[@value='radio3']"));
		
		System.out.println(radio1.isDisplayed());
		System.out.println(radio2.isDisplayed());
		System.out.println(radio3.isDisplayed());
		
		System.out.println(radio1.isEnabled());
		System.out.println(radio2.isEnabled());
		System.out.println(radio3.isEnabled());
		
		radio1.click();
		System.out.println(radio1.isSelected());
		System.out.println(radio2.isSelected());
		System.out.println(radio3.isSelected());
		
		radio2.click();
		System.out.println(radio1.isSelected());
		System.out.println(radio2.isSelected());
		System.out.println(radio3.isSelected());
		
		radio3.click();
		System.out.println(radio1.isSelected());
		System.out.println(radio2.isSelected());
		System.out.println(radio3.isSelected());
		
	
	}

}
