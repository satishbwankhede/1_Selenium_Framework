package BasicAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHover 
{
	public static void main(String[] args) throws InterruptedException 

	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
		
		Thread.sleep(2000);
		
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("Forgotten password?"))).perform();
		System.out.println("Forgotten password? Hover is done");
		
	 
	}
}
