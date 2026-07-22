package BasicAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) 
											// Get A Page Title
	{
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
		 
		String ActualTitle=driver.getTitle();
		System.out.println("Atual Title "+ActualTitle);
		
		String ExpectedlTitle="Facebook";
		System.out.println("Expected Title "+ExpectedlTitle);
		
		
		if (ActualTitle.equalsIgnoreCase(ExpectedlTitle)) 
		{
		System.out.println("Test Caqse is  Passed");	
		}
		else {
			System.out.println("test Case is failed");
		}
		
		driver.close();
		
		

	}

}
