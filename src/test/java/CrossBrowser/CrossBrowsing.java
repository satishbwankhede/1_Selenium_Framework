package CrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowsing {

	WebDriver driver;
	
	@Parameters ("BrowserName")
	
	
	@BeforeTest
	public void BrowserSetUpProcess( String BrowserName ) throws InterruptedException 
	{
		
		if (BrowserName.equalsIgnoreCase("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
            System.out.println("Chrome Browser is launched");
        } 
		else if (BrowserName.equalsIgnoreCase("firefox")) 
		{
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			
            System.out.println("Firefox Browser is launched");
        } 
		else if (BrowserName.equalsIgnoreCase("edge")) 
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
            System.out.println("Edge Browser is launched");
        } 
		
	}
	@Test
	public void LaunchURLinMultipleBrowser() throws InterruptedException {
		
		driver.get("https://www.myntra.com/");
		
		Thread.sleep(2000);
        
    }
	
	@AfterTest
	public void CloseBrowser() {

	}
} 
