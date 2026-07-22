package BasicAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchtab 
{
	public static void main(String[] args) throws InterruptedException 
	{

		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.letskodeit.com/practice");
		 Thread.sleep(2000);
		 
		 
		WebElement SwitchTab=driver.findElement(By.xpath("//*[@id=\"opentab\"]"));
		SwitchTab.click();
		System.out.println("Clicked And Tab is Switched "+SwitchTab.isDisplayed());
		
		driver.close();
		
	}

}
