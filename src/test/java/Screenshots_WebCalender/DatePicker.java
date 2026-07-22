package Screenshots_WebCalender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		
		
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		

		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		 String expectedMonth = "December";
	        String expectedYear = "2026";
	        
	        
	        
	        while (true)
	        {
	            String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	            String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	            
	            System.out.println("Month: " + month + ", Year: " + year);

	            if (month.equalsIgnoreCase(expectedMonth) &&
	                year.equalsIgnoreCase(expectedYear))
	            {
	                driver.findElement(By.xpath("//a[@data-date='22']")).click();
	                break;
	            }

	            driver.findElement(By.xpath("//span[text()='Next']")).click();
	        }

		driver.close();
	}

}
