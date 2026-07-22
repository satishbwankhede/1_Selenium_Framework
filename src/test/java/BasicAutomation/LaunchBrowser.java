package BasicAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */
public class LaunchBrowser {
	
	//Launch Browser and Enter User and pass and Log in 

	public static void main(String[] args) 
	{

		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
		 
		 driver.findElement(By.name("email")).sendKeys("satish@gmail.com");
		 driver.findElement(By.name("pass")).sendKeys("Fe@865gfhf  000");
		 driver.findElement(By.xpath("//div[@aria-label='Log in']")).click();

	}

}
