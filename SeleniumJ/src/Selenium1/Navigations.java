package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/login");
		Thread.sleep(3000);
		driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(3000);
       System.out.println(driver.getTitle());
       System.out.println(driver.getCurrentUrl());
       driver.navigate().back();
       driver.navigate().forward();
       Thread.sleep(3000);
        
        
	

}
}
