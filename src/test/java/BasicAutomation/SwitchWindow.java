package BasicAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow 
{
	public static void main(String[] args) throws InterruptedException 
	{
		

		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.letskodeit.com/practice");
		 Thread.sleep(2000);
		 
		 
		WebElement SwitchWindow=driver.findElement(By.xpath("//*[@id=\"openwindow\"]"));
		SwitchWindow.click();
		System.out.println("Clicked And Window is Switched "+SwitchWindow.isDisplayed());
		
		driver.close();

	}

}
