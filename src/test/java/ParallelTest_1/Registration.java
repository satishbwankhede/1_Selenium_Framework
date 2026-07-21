package ParallelTest_1;

import org.testng.annotations.Test;

public class Registration {
  @Test
  public void InputFieldFunctinality() {
	  
	  System.out.println("verify all the input fields (First Name, Last Name, Email, Password, Confirm Password) are working properly");
  }

  @Test
  public void EmailFormatevalidation() {
	  
	  System.out.println("verify email field accept only valid formate --such as abc@gmail.com");
  }
  
  
  @Test
  public void PasswordPolicyValidation() {
	  
	  System.out.println("verify password meets defied rules (lenght,uppercase,special character, etc");
  }
  
  
}
