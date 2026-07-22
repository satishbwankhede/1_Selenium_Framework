package Screenshots_WebCalender;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotsCapture {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		
		//Full page screenshot	
		
//		TakesScreenshot ss=(TakesScreenshot)driver;
//
//		File sc=ss.getScreenshotAs(OutputType.FILE);
//
//		File location=new File("C:\Auto-Testing\GitHub Repository\1_Selenium_Framework\src\test\resources\fb.png");
//
//		FileHandler.copy(sc, location);
		
		// Screenshot of specific element

		WebElement ss=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div[1]/section[4]/img"));


		File sc=ss.getScreenshotAs(OutputType.FILE);

		File location=new File("C:\\Auto-Testing\\GitHub Repository\\1_Selenium_Framework\\src\\test\\resources\\Specific.png");

		FileHandler.copy(sc, location);



		System.out.println("Screenshot captured successfully");
		
		
		

	}

}
