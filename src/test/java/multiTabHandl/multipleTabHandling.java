package multiTabHandl;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleTabHandling {

	 public static void main(String[] args) throws InterruptedException {

	        // 1. Launch Chrome browser
	        WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        // 2. Launch URL - Tab 1
	        driver.get("https://www.myntra.com/mirrors");

	        // Get Parent Tab title
	        System.out.println("Parent Tab Title: " + driver.getTitle());

	        // 3. Click product which opens in second tab
	        WebElement product = driver.findElement(
	                By.xpath("(//li[contains(@class,'product-base')]//a)[1]")
	        );

	        product.click();

	        Thread.sleep(3000);

	        // 4. Get all window/tab IDs
	        Set<String> handles = driver.getWindowHandles();

	        // 5. Create Iterator
	        Iterator<String> itr = handles.iterator();

	        // Parent Window ID
	        String parentWindow = itr.next();

	        // Child Window ID
	        String childWindow = itr.next();

	        System.out.println("Parent Window ID: " + parentWindow);
	        System.out.println("Child Window ID: " + childWindow);

	        // 6. Switch to Child Tab
	        driver.switchTo().window(childWindow);

	        // 7. Get Child Tab title
	        System.out.println("Child Tab Title: " + driver.getTitle());
	        System.out.println("Child Tab URL: " + driver.getCurrentUrl());

	        // 8. Switch back to Parent Tab
	        driver.switchTo().window(parentWindow);

	        // 9. Get Parent Tab title
	        System.out.println("Parent Tab Title: " + driver.getTitle());
	        System.out.println("Parent Tab URL: " + driver.getCurrentUrl());

	        // Close browser
	        driver.quit();
		 

	}

}
