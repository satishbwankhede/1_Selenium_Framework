package AutomationFrames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingAutoSuggetions {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-extensions");
		options.addArguments("disable-popups-blocking");
		
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		
		
		
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenium");
		Thread.sleep(2000);
		
		//Capture All Suggestion
		
		List<WebElement> searchList=driver.findElements(By.xpath("//ul[@role='listbox']//li[@role='presentation']"));
		System.out.println("Number of Search List is : "+searchList.size());
		
		
		
		//Print All Suggestions
		
		for (WebElement searchName : searchList) 
		{
			String searchValue=searchName.getText();
			System.out.println(searchValue);
			
		}
		
		
		
		//Click any Specific Suggestions after printing
		
		for (WebElement searchName : searchList) 
		{
			if (searchName.getText().equalsIgnoreCase("Selenium Webdriver")) 
			{
				searchName.click();
				break;
				
			}
			
		}
		
		
	
	}

}
