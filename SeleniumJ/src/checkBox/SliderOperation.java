package checkBox;

import org.asynchttpclient.filter.ReleasePermitOnComplete;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderOperation {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/slider/#colorpicker");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	driver.switchTo().frame(0);
	Thread.sleep(1000);
	
	WebElement slider=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
	Thread.sleep(1000);
	Actions a=new Actions(driver);
	Thread.sleep(1000);
	a.clickAndHold(slider).moveByOffset(75, 0).release().build().perform();
	Thread.sleep(1000);
    a.clickAndHold(slider).moveByOffset(-50, 0).release().build().perform();
    
   
	WebElement sliders=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
	Thread.sleep(1000);
	Actions b=new Actions(driver);
	Thread.sleep(1000);
	b.clickAndHold(slider).moveByOffset(65, 0).release().build().perform();
	Thread.sleep(1000);
	b.clickAndHold(slider).moveByOffset(-40, 0).release().build().perform();
	Thread.sleep(1000);
	
	
	
	}

}
