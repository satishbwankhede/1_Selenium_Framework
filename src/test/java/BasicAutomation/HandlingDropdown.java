package BasicAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HandlingDropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(2000);
		
		
		
		Select dropdown=new Select(driver.findElement(By.cssSelector("select#carselect")));
		
		dropdown.selectByIndex(1);							// Selected By Index 
		Thread.sleep(2000);
		
		System.out.println("Index selected");
		
		
		dropdown.selectByValue("honda");					// Selected By Value
		Thread.sleep(2000);
		
		System.out.println("Value selected");
		
		dropdown.selectByVisibleText("BMW");				//Selected By Visible text
		Thread.sleep(2000);
		
		System.out.println("Text selected");
	}

}
