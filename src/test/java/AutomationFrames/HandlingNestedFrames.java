package AutomationFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingNestedFrames 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-extensions");
		options.addArguments("disable-popups-blocking");
		
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[contains(text(), 'Iframe with in an Iframe')]")).click();
		System.out.println("1 Clicked on Iframe with in an Iframe");
		
		
		//Parent Iframe
		WebElement parentframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(parentframe);		Thread.sleep(2000);
		System.out.println("2 Entereed in parent Iframe");
		
		
		//Child Iframe
		
	    WebElement childframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	    driver.switchTo().frame(childframe);
		System.out.println("3 Entereed in Chiled Iframe");
	    
	    
	    driver.findElement(By.xpath("//input[@type='text']")).
	    sendKeys("Satish Wankhede");
		Thread.sleep(2000);
		System.out.println("4 Text Entered in Child Iframe");
		
		driver.switchTo().parentFrame();
		System.out.println("5 Back to parent Iframe");
		
		
		driver.switchTo().defaultContent();
		System.out.println("6 Back to main page");
	    
		//Back Single Iframe
		
		driver.findElement(By.xpath("//a[contains(text(), 'Single Iframe ')]")).click();
		Thread.sleep(2000);
		System.out.println("7 Back to Single Iframe");
		
		
		
	}
}
