package BasicAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_RadioBtn {
	public static void main(String[] args) throws InterruptedException 
	{
		

		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.letskodeit.com/practice");
		 Thread.sleep(2000);
		 
		 
		WebElement BmwRadio=driver.findElement(By.xpath("//*[@id=\"bmwradio\"]"));
		BmwRadio.click();
		System.out.println("BMW Radio btn Is Selected  "+BmwRadio.isSelected());
		 Thread.sleep(2000);
		
		
		WebElement BenzRadio=driver.findElement(By.xpath("//*[@id=\"benzradio\"]"));
		BenzRadio.click();
		System.out.println("BMW Radio btn Is Selected  "+BenzRadio.isSelected());
		 Thread.sleep(2000);
		
		
		WebElement HondaRadio=driver.findElement(By.xpath("//*[@id=\"hondaradio\"]"));
		HondaRadio.click();
		System.out.println("BMW Radio btn Is Selected  "+HondaRadio.isSelected());
		 Thread.sleep(2000);
		
	}



}
