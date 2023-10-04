package carrancy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CarrencyHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement cur=driver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']"));
		cur.click();
		Thread.sleep(2000);
		Select S=new Select(cur);
		//S.selectByIndex(3);
		
		List<WebElement> m1=S.getOptions();
		for(int i=0; i<m1.size(); i++)
		{
			System.out.println(m1.get(i).getText());
			{
				if(m1.get(i).getText().equalsIgnoreCase("USD"))
				{
					m1.get(i).click();
					break;
					
				}
			}
		}
		for (WebElement k:m1)
		{
			System.out.println(k.getText());
			{
				if(k.getText().equalsIgnoreCase("ind"))
				{
					k.click();
					break;
				}
			}
		}
				
	}

}
