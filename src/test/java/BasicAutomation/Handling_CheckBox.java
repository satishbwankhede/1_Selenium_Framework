package BasicAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_CheckBox {

	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.letskodeit.com/practice");
		 Thread.sleep(2000);
		 
		 
		WebElement BmwCheckBtn=driver.findElement(By.xpath("//*[@id=\"bmwcheck\"]"));
		BmwCheckBtn.click();
		System.out.println("BMW Check btn Is Selected  "+BmwCheckBtn.isSelected());
		Thread.sleep(2000);
		
		WebElement HondaCheckBtn=driver.findElement(By.xpath("//*[@id=\"hondacheck\"]"));
		HondaCheckBtn.click();
		System.out.println("Honda Check btn Is Selected  "+HondaCheckBtn.isSelected());
		Thread.sleep(2000);	
		
		 
		WebElement BenzCheckBtn=driver.findElement(By.xpath("//*[@id=\"benzcheck\"]"));
		BenzCheckBtn.click();
		System.out.println("Benz Check btn Is Selected  "+BenzCheckBtn.isSelected());
		Thread.sleep(2000);	
		 
	

	}

}
