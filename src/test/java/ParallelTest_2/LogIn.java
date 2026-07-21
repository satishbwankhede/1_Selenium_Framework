package ParallelTest_2;

import org.testng.annotations.Test;

public class LogIn {
	 @Test
	  public void InputUserName() {
		 
		  System.out.println("user should be able to enter username in the username field");
	  }

	  @Test
	  public void InputPassword() {
		  
		  System.out.println("Password field should accept input and mask the password");
	  }
	  
	  
	  @Test
	  public void LogInButton() {
		  
		  System.out.println("Click on login button should redirect user to home page");
	  }
}
