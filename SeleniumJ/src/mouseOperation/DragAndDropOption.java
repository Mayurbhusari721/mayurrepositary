package mouseOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropOption {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions a=new Actions(driver);
		
		WebElement m1=driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement m2=driver.findElement(By.xpath("//div[@id='box106']"));
		a.dragAndDrop(m1, m2).build().perform();
		Thread.sleep(1000);
		
		WebElement m3=driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement m4=driver.findElement(By.xpath("//div[@id='box101']"));
		a.dragAndDrop(m3, m4).build().perform();
		Thread.sleep(2000);
		
		WebElement m5=driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement m6=driver.findElement(By.xpath("//div[@id='box105']"));
		a.dragAndDrop(m5, m6).build().perform();
		Thread.sleep(1000);
		
		WebElement m7=driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement m8=driver.findElement(By.xpath("//div[@id='box103']"));
		a.dragAndDrop(m7, m8).build().perform();
		Thread.sleep(1000);
		
		WebElement m9=driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement m10=driver.findElement(By.xpath("//div[@id='box107']"));
		a.dragAndDrop(m9, m10).build().perform();
		Thread.sleep(1000);
		
		WebElement m11=driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement m12=driver.findElement(By.xpath("//div[@id='box104']"));
		a.dragAndDrop(m11, m12).build().perform();
		Thread.sleep(1000);
		
		WebElement m13=driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement m14=driver.findElement(By.xpath("//div[@id='box102']"));
		a.dragAndDrop(m13, m14).build().perform();
		Thread.sleep(1000);
		
		
			
		
				
	}

}
