package BasicAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNavigation 
{
	public static void main(String[] args) throws InterruptedException 
	{
		

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.get("https://www.meesho.com/");
		Thread.sleep(2000);
		
		
		driver.navigate().back();								//Back to Flipkart
		
		driver.navigate().forward();							//forward to Meesho
		
		driver.navigate().to("https://www.amazon.in/");			//Navigate to Amazon
		
		
		Thread.sleep(4000);
		
		driver.navigate().refresh();							//Refresh Amazon
	}

}
